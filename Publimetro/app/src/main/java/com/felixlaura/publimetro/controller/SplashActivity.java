package com.felixlaura.publimetro.controller;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;

import com.felixlaura.publimetro.R;


public class SplashActivity extends Activity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable(){

            /*
             *Showing Splash screen with a timer. This will be useful when
              * you want to show a case your app logo/company
             */

            public void run(){
            /*
             *This method will be executed once the timer is over
             * Start your app main activity
             */

                Intent i = new Intent(SplashActivity.this, SeleccionaUbicacionActivity.class);
                startActivity(i);

                //close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}
