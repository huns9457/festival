package com.example.huns9.chicwars;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ChicWars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chic_wars);


    }
    public void onButton1Clicked(View v){
        Toast.makeText(this,"환영한닭!", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }

}
