package com.example.huns9.chicwars;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DuruMap extends AppCompatActivity
        implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_map);
        FragmentManager fragmentManager = getFragmentManager();
        MapFragment mapFragment = (MapFragment)fragmentManager
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap map) {

        LatLng DURU = new LatLng(35.847930, 128.557541);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(DURU);
        markerOptions.title("두류공원");
        markerOptions.snippet("치맥페스티벌");
        map.addMarker(markerOptions);


        map.moveCamera(CameraUpdateFactory.newLatLng(DURU));
        map.animateCamera(CameraUpdateFactory.zoomTo(12));
    }

}
