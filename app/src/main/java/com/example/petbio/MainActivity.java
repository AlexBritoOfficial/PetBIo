package com.example.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /** Load up Pet Image Views **/
    private ImageView catImageView;
    private ImageView dogImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catImageView = (ImageView) findViewById(R.id.catImageViewID);
        dogImageView = (ImageView) findViewById(R.id.dogImageViewID);

        catImageView.setOnClickListener(this);
        dogImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.catImageViewID:
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name", "Jarvis");
                catIntent.putExtra("bio", "Great cat. Loves people and meows a lot!");
                startActivity(catIntent);
                break;


            case R.id.dogImageViewID:
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name", "Dufus");
                dogIntent.putExtra("bio", "Great dog. Loves people and does not bark!");
                startActivity(dogIntent);
                break;
        }
    }
}
