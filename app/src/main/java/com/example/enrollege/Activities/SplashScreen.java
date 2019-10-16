package com.example.enrollege.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.enrollege.R;

public class SplashScreen extends AppCompatActivity {

    private Layout layout;
    private ImageView logo;
    private View view;
    private ImageView signin;

    Animation animFade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        view = (View)findViewById(R.id.view);
        signin = (ImageView)findViewById(R.id.signin);
        logo=(ImageView) findViewById(R.id.logo);


        animFade = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.item_fall_down );
        animFade.setInterpolator(new LinearInterpolator());
        animFade.setRepeatCount(Animation.INFINITE);
        animFade.setDuration(2000);
        logo.startAnimation(animFade);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signin.setVisibility(View.VISIBLE);
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });

    }
        private void launchActivity() {

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }


