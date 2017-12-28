package com.example.huns9.chicwars;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.json.JSONException;
import org.json.JSONObject;

public class MenuActivity extends AppCompatActivity {
    private Button buttonScan;
    private TextView score2, textViewResult;

    private IntentIntegrator qrScan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        buttonScan =(Button) findViewById(R.id.button8);
        score2 = (TextView) findViewById(R.id.score2);

        qrScan = new IntentIntegrator(this);

        buttonScan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                qrScan.setPrompt("Scanning...");

                qrScan.initiateScan();
            }
        });
    }

    public void onMapButtonClicked(View v){
        Intent intent = new Intent(this,MissionMap.class);
        startActivity(intent);
    }

    public void onBackButtonClicked(View v){
        Intent intent = new Intent(this,DuruMap.class);
        startActivity(intent);
    }
    public void onMissionButtonClicked(View v){
        Intent intent = new Intent(this,MissionScene.class);
        startActivity(intent);
    }
    @Override
    protected  void onActivityResult(int requestCode, int resultCode, Intent data){
        final DBHelper dbHelper = new DBHelper(getApplicationContext(), "EGG.db", null, 1);
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null){

            if (result.getContents()==null){
                Toast.makeText(MenuActivity.this, "취소", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(MenuActivity.this, "스캔완료", Toast.LENGTH_SHORT).show();
                try {
                    {
                        JSONObject obj = new JSONObject(result.getContents());


                        score2.setText(obj.getString("score"));


                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    textViewResult.setText(result.getContents());

                }
            }
        }
        else {
            super.onActivityResult(requestCode, requestCode, data);
        }

    }
}
