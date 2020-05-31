package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {
    ImageView iconImage;

    TextView java_tutorials;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        iconImage = (ImageView)findViewById(R.id.splash);
        java_tutorials = (TextView)findViewById(R.id.splashtext);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        iconImage.setAnimation(myanim);
        java_tutorials.setAnimation(myanim);

        final Intent i = new Intent(Splash_Screen.this,MainActivity.class);
        Thread timer = new Thread(){
            public void run()
            {
                try{
                    sleep(5000);//5 secs
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}
