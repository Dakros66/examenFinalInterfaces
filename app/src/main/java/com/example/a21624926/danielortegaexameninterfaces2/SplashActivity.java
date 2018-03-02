package com.example.a21624926.danielortegaexameninterfaces2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity  implements Animation.AnimationListener {

    private final int DURACION_SPLASH = 4000;
    private TextView textviewSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        textviewSplash = (TextView) findViewById(R.id.textViewSplash);
        Animation animaTexto = AnimationUtils.loadAnimation(this, R.anim.leftin);
        textviewSplash.startAnimation(animaTexto);
        animaTexto.setAnimationListener(this);




        new Handler().postDelayed(new Runnable(){
            public void run(){

                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}



