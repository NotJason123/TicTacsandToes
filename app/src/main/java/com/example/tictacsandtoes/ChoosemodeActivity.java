package com.example.tictacsandtoes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ChoosemodeActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choosemode);
        mp = MediaPlayer.create(ChoosemodeActivity.this, R.raw.sound11);

    }

    public void Onclick(View view) {
        startActivity(new Intent(ChoosemodeActivity.this, Singleplayer.class));
        mp.start();
    }
}



