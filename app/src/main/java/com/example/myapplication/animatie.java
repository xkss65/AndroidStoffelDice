package com.example.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class animatie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView d1 = (ImageView) findViewById(R.id.imageView);
        final ImageView b1 = (ImageView) findViewById(R.id.imageView14);
        final ImageView b2 = (ImageView) findViewById(R.id.imageView15);
        final ImageView b3 = (ImageView) findViewById(R.id.imageView16);
        final ImageView b4 = (ImageView) findViewById(R.id.imageView17);
        final ImageView b5 = (ImageView) findViewById(R.id.imageView18);
        final ImageView b6 = (ImageView) findViewById(R.id.imageView19);
        final ImageView b7 = (ImageView) findViewById(R.id.imageView20);
        final ImageView b8 = (ImageView) findViewById(R.id.imageView21);

//        d1.bringToFront();
        d1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
//                d1.setImageResource(R.drawable.dob1);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b1.setImageResource(R.drawable.a1);
                        b1.bringToFront();
                        d1.setVisibility(View.GONE);
                        b1.setVisibility(View.VISIBLE);
                    }
                }, 0);

//                b1.setImageResource(R.drawable.a1);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b2.setImageResource(R.drawable.a2);
                        b2.bringToFront();
                        b1.setVisibility(View.GONE);
                        b2.setVisibility(View.VISIBLE);
                    }
                }, 050);

//                b2.setImageResource(R.drawable.a2);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b3.setImageResource(R.drawable.a3);
                        b3.bringToFront();
                        b2.setVisibility(View.GONE);
                        b3.setVisibility(View.VISIBLE);
                    }
                }, 100);

//                b3.setImageResource(R.drawable.a3);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b4.setImageResource(R.drawable.a4);
                        b4.bringToFront();
                        b3.setVisibility(View.GONE);
                        b4.setVisibility(View.VISIBLE);
                    }
                }, 150);

//                b4.setImageResource(R.drawable.a4);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b5.setImageResource(R.drawable.a5);
                        b5.bringToFront();
                        b4.setVisibility(View.GONE);
                        b5.setVisibility(View.VISIBLE);
                    }
                }, 200);

//                b5.setImageResource(R.drawable.a5);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b6.setImageResource(R.drawable.a6);
                        b6.bringToFront();
                        b5.setVisibility(View.GONE);
                        b6.setVisibility(View.VISIBLE);
                    }
                }, 250);

//                b6.setImageResource(R.drawable.a6);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b7.setImageResource(R.drawable.a7);
                        b7.bringToFront();
                        b6.setVisibility(View.GONE);
                        b7.setVisibility(View.VISIBLE);
                    }
                }, 300);

//                b7.setImageResource(R.drawable.a7);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        b8.setImageResource(R.drawable.a8);
                        b8.bringToFront();
                        b7.setVisibility(View.GONE);
                        b8.setVisibility(View.VISIBLE);
                    }
                }, 350);

//                b8.setImageResource(R.drawable.a8);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        d1.setImageResource(R.drawable.dob6);
                        d1.bringToFront();
                        b8.setVisibility(View.GONE);
                        d1.setVisibility(View.VISIBLE);
                    }
                }, 400);

//                b1.setVisibility(View.GONE);
//                b2.setVisibility(View.VISIBLE);
            }
        });
    }
}
