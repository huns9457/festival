package com.example.huns9.chicwars;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class DuruMap extends AppCompatActivity
        implements OnMapReadyCallback {
    private static final LatLng toilt = new LatLng(35.852110,128.556079);
    private static final LatLng toilt1 = new LatLng(35.850734, 128.557649);
    private static final LatLng toilt2 = new LatLng(35.851427, 128.559881);
    private static final LatLng toilt3 = new LatLng(35.850796, 128.560417);
    private static final LatLng toilt4 = new LatLng(35.844674, 128.559499);
    private static final LatLng dambe = new LatLng(35.849881, 128.555909);
    private static final LatLng dambe1 = new LatLng(35.851209, 128.560294);
    private static final LatLng heal = new LatLng(35.850053, 128.556289);
    private static final LatLng heal1 = new LatLng(35.850655, 128.560643);
    private static final LatLng heal2 = new LatLng(35.852168, 128.559976);



    private Marker mToilt;
    private Marker mToilt1;
    private Marker mToilt2;
    private Marker mToilt3;
    private Marker mToilt4;
    private Marker mDambe;
    private Marker mDambe1;
    private Marker mHeal;
    private Marker mHeal1;
    private Marker mHeal2;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_duru_map);
        FragmentManager fragmentManager = getFragmentManager();
        MapFragment mapFragment = (MapFragment)fragmentManager
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap map) {
        mMap = map;
        mToilt = mMap.addMarker( new MarkerOptions()
            .position(toilt)
            .title("화장실") );
        mToilt.setTag(0);

        mToilt1 = mMap.addMarker(new MarkerOptions()
                .position(toilt1)
                .title("화장실"));
        mToilt1.setTag(0);

        mToilt2 = mMap.addMarker(new MarkerOptions()
                .position(toilt2)
                .title("화장실"));
        mToilt2.setTag(0);

        mToilt3 = mMap.addMarker(new MarkerOptions()
                .position(toilt3)
                .title("화장실"));
        mToilt3.setTag(0);

        mToilt4 = mMap.addMarker(new MarkerOptions()
                .position(toilt4)
                .title("화장실"));
        mToilt4.setTag(0);

        mDambe = mMap.addMarker(new MarkerOptions()
                .position(dambe)
                .title("흡연구역"));
        mDambe.setTag(0);

        mDambe1 = mMap.addMarker(new MarkerOptions()
                .position(dambe1)
                .title("흡연구역"));
        mDambe1.setTag(0);

        mHeal = mMap.addMarker(new MarkerOptions()
                .position(heal)
                .title("구급실"));
        mHeal.setTag(0);

        mHeal1 = mMap.addMarker(new MarkerOptions()
                .position(heal1)
                .title("구급실"));
        mHeal1.setTag(0);

        mHeal2 = mMap.addMarker(new MarkerOptions()
                .position(heal2)
                .title("구급실"));
        mHeal2.setTag(0);


        LatLng DURU = new LatLng(35.847930, 128.557541);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(DURU);
        markerOptions.title("두류공원");
        markerOptions.snippet("치맥페스티벌");
        map.addMarker(markerOptions);


        map.moveCamera(CameraUpdateFactory.newLatLng(DURU));
        map.animateCamera(CameraUpdateFactory.zoomTo(12));
    }
    //화장실
    public void duruButtonClicked(View v){
        mToilt.setAlpha( 1.0f );
        mToilt1.setAlpha( 1.0f );
        mToilt2.setAlpha( 1.0f );
        mToilt3.setAlpha( 1.0f );
        mToilt4.setAlpha( 1.0f );
        mDambe.setAlpha( 0.1f );
        mDambe1.setAlpha( 0.1f );
        mHeal.setAlpha( 0.1f );
        mHeal1.setAlpha( 0.1f );
        mHeal2.setAlpha( 0.1f );
    }

    //흡연장
    public void duru1ButtonClicked(View v){
        mToilt.setAlpha( 0.1f );
        mToilt1.setAlpha( 0.1f );
        mToilt2.setAlpha( 0.1f );
        mToilt3.setAlpha( 0.1f );
        mToilt4.setAlpha( 0.1f );
        mDambe.setAlpha( 1.0f );
        mDambe1.setAlpha( 1.0f );
        mHeal.setAlpha( 0.1f );
        mHeal1.setAlpha( 0.1f );
        mHeal2.setAlpha( 0.1f );

    }
    //구급실
    public void duru2ButtonClicked(View v){
        mToilt.setAlpha( 0.1f );
        mToilt1.setAlpha( 0.1f );
        mToilt2.setAlpha( 0.1f );
        mToilt3.setAlpha( 0.1f );
        mToilt4.setAlpha( 0.1f );
        mDambe.setAlpha( 0.1f );
        mDambe1.setAlpha( 0.1f );
        mHeal.setAlpha( 1.0f );
        mHeal1.setAlpha( 1.0f );
        mHeal2.setAlpha( 1.0f );
    }

}
