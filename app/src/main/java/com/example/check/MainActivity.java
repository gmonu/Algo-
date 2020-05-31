package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView im1, im2, im3, im4, im5, im6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im1 = (ImageView)findViewById(R.id.i1);
        im2 = (ImageView)findViewById(R.id.i2);
        im3 = (ImageView)findViewById(R.id.i3);
        im4 = (ImageView)findViewById(R.id.i4);
        im5 = (ImageView)findViewById(R.id.i5);
        im6 = (ImageView)findViewById(R.id.i6);

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Insertion.class));

            }
        });

        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Selection.class));
            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Bubble.class));
            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Merge.class));
            }
        });
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Heap.class));
            }
        });
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Quick.class));
            }
        });
    }


}
