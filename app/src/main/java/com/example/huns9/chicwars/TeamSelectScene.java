package com.example.huns9.chicwars;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TeamSelectScene extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_select_scene);
    }
    public void onAButtonClicked(View v){
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);
    }
    public void onBButtonClicked(View v){
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);
    }
}
