package com.carlosalcantara.felicitacion;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cumplefelizrockero);
        mediaPlayer.start();

        TextView titulo = (TextView) findViewById(R.id.titulo);
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        titulo.startAnimation(animacion);

        ImageView image = (ImageView) findViewById(R.id.imageView);
        Animation hyperspaceJump = AnimationUtils.loadAnimation(this, R.anim.animacion2);
        image.startAnimation(hyperspaceJump);

    }
}