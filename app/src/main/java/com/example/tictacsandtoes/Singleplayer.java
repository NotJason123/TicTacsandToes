package com.example.tictacsandtoes;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

public class Singleplayer extends AppCompatActivity {
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleplayer);
        mp = MediaPlayer.create(Singleplayer.this, R.raw.sound11);
    }

    public void Onclick2(View view){
        startActivity(new Intent(Singleplayer.this, ChoosemodeActivity.class));
        mp.start();

    }
}