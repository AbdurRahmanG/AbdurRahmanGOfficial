package com.techilyfly.abdurrahmang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.techilyfly.abdurrahmang.musicplay.MusicPlayActivity;
import com.techilyfly.abdurrahmang.videoplay.VideoPlayActivity;

public class MainActivity extends AppCompatActivity {

    Button AbdurRahmanG;
    Button TechilyFly;
    Button AaMGaLI;
    Button VideoPlay;
    Button MusicPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        // This Button Will Send you in AbdurRahmanGActivity
        AbdurRahmanG = (Button) findViewById(R.id.buttonAbdurRahmanG);

        // This Button Will send you in TechilyFlyActivity
        TechilyFly = (Button) findViewById(R.id.buttonTechilyFly);

        // This Button will send you in AaMGaLIActivity
        AaMGaLI = (Button) findViewById(R.id.buttonAaMGaLI);

        // This Button will Send you in VideoPlayActivity
        VideoPlay = (Button) findViewById(R.id.buttonVideoPlay);

        // This Button Will send you in MusicPlayActivity
        MusicPlay = (Button) findViewById(R.id.buttonMusicPlay);

        // Here we have defined Go From MainActivity to AbdurRahmanGActivity
        AbdurRahmanG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbdurRahmanG = new Intent(MainActivity.this, AbdurrahmangActivity.class);
                startActivity(intentAbdurRahmanG);
            }
        });

        // Here we have defined Go From MainActivity to TechilyFlyActivity
        TechilyFly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTechilyFly = new Intent(MainActivity.this, TechilyflyActivity.class);
                startActivity(intentTechilyFly);
            }
        });

        // Here we have defined Go From MainActivity to AaMGaLIActivity
        AaMGaLI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAaMGaLI = new Intent(MainActivity.this, AamgaliActivity.class);
                startActivity(intentAaMGaLI);
            }
        });

        // Here we have defined for Go From MainActivity to MainActivity to VideoPlayActivity
        VideoPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVideoPlay = new Intent(MainActivity.this, VideoPlayActivity.class);
                startActivity(intentVideoPlay);
            }
        });

        // Here we have defined for Go from MainActivity to MusicPlayActivity
        MusicPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMusicPlay = new Intent(MainActivity.this, MusicPlayActivity.class);
                startActivity(intentMusicPlay);
            }
        });

    }
}