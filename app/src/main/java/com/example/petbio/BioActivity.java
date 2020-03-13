package com.example.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView petBioImageView;
    private TextView petName;
    private TextView petBio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petBioImageView = (ImageView) findViewById(R.id.petBioImageViewID);
        petName = (TextView) findViewById(R.id.petNameTextViewID);
        petBio = (TextView) findViewById(R.id.petBioTextViewID);

        extras = getIntent().getExtras();

        if(extras != null){
            String name = extras.getString("name");
            String bio = extras.getString("bio");
            setUp(name, bio);
        }
    }

    public void setUp(String name, String bio){
        if(name.equals("Dufus")){
            petBioImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_dog));
            petName.setText(name);
            petBio.setText(bio);
        }

        else if (name.equals("Jarvis")){
            petBioImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_cat));
            petName.setText(name);
            petBio.setText(bio);
        }
    }
}
