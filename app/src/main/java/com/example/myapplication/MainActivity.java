package com.example.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.Image;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.os.*;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String hulpstring;
    int geworpen;
    int x = 3;
    String stringGeworpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer sound = MediaPlayer.create(this,R.raw.roll);

        final ImageView d1 = (ImageView) findViewById(R.id.imageView);
        final ImageView b1 = (ImageView) findViewById(R.id.imageView14);
        final ImageView b2 = (ImageView) findViewById(R.id.imageView15);
        final ImageView b3 = (ImageView) findViewById(R.id.imageView16);
        final ImageView b4 = (ImageView) findViewById(R.id.imageView17);
        final ImageView b5 = (ImageView) findViewById(R.id.imageView18);
        final ImageView b6 = (ImageView) findViewById(R.id.imageView19);
        final ImageView b7 = (ImageView) findViewById(R.id.imageView20);
        final ImageView b8 = (ImageView) findViewById(R.id.imageView21);

        final TextView textview = (TextView) findViewById(R.id.textView);

        final ImageButton vorige = (ImageButton) findViewById(R.id.imageButton3);
        final ImageButton volgende = (ImageButton) findViewById(R.id.imageButton4);

//        final dice dobbelsteenObj = new dice(16.66,16.66,16.66,16.66,16.66,16.66);
        final dice dobbelsteenObj[] = new dice[4];
        dobbelsteenObj[0] = new dice(16.66,16.66,16.66,16.66,16.66,16.66);
        dobbelsteenObj[1] = new dice(16.66,16.66,16.66,16.66,16.66,16.66);
        dobbelsteenObj[2] = new dice(16.66,16.66,16.66,16.66,16.66,16.66);
        dobbelsteenObj[3] = new dice(16.66,16.66,16.66,16.66,16.66,16.66);
//        x =3;

        hulpstring =    "Kans op... 1=" + dobbelsteenObj[x].getPercEen() +
                "%, 2=" + dobbelsteenObj[x].getPercTwee()  +
                "%, 3=" + dobbelsteenObj[x].getPercDrie()  + "%" + "\n" +
                "             4=" + dobbelsteenObj[x].getPercVier()  +
                "%, 5=" + dobbelsteenObj[x].getPercVijf()  +
               "%, 6=" + dobbelsteenObj[x].getPercZes()  +
                "%";

        textview.setText(hulpstring);

//        volgende.setVisibility(View.GONE);
//        vorige.setVisibility(View.VISIBLE);
//        vorige.bringToFront();

        vorige.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                System.out.print("oud en nieuww: " + dobbelsteenObj[2].getLaatstGegooid() + " en " + dobbelsteenObj[3].getLaatstGegooid() + "\n");

                dobbelsteenObj[0].setLaatstGegooid(dobbelsteenObj[x].getLaatstGegooid());
                dobbelsteenObj[0].setPercEen(dobbelsteenObj[x].getPercEen());
                dobbelsteenObj[0].setPercTwee(dobbelsteenObj[x].getPercTwee());
                dobbelsteenObj[0].setPercDrie(dobbelsteenObj[x].getPercDrie());
                dobbelsteenObj[0].setPercVier(dobbelsteenObj[x].getPercVier());
                dobbelsteenObj[0].setPercVijf(dobbelsteenObj[x].getPercVijf());
                dobbelsteenObj[0].setPercZes(dobbelsteenObj[x].getPercZes());

                dobbelsteenObj[x].setLaatstGegooid(dobbelsteenObj[2].getLaatstGegooid());
                dobbelsteenObj[x].setPercEen(dobbelsteenObj[2].getPercEen());
                dobbelsteenObj[x].setPercTwee(dobbelsteenObj[2].getPercTwee());
                dobbelsteenObj[x].setPercDrie(dobbelsteenObj[2].getPercDrie());
                dobbelsteenObj[x].setPercVier(dobbelsteenObj[2].getPercVier());
                dobbelsteenObj[x].setPercVijf(dobbelsteenObj[2].getPercVijf());
                dobbelsteenObj[x].setPercZes(dobbelsteenObj[2].getPercZes());

                geworpen = dobbelsteenObj[x].getLaatstGegooid();

                switch (geworpen) {
                    case 1: d1.setImageResource(R.drawable.dob1); break;
                    case 2: d1.setImageResource(R.drawable.dob2); break;
                    case 3: d1.setImageResource(R.drawable.dob3); break;
                    case 4: d1.setImageResource(R.drawable.dob4); break;
                    case 5: d1.setImageResource(R.drawable.dob5); break;
                    case 6: d1.setImageResource(R.drawable.dob6); break;
                    default: d1.setImageResource(R.drawable.dob6);
                }

                hulpstring =    "Kans op... 1=" + (int)(dobbelsteenObj[x].getPercEen() + 0.5) +
                        "%, 2=" + (int)(dobbelsteenObj[x].getPercTwee() + 0.5) +
                        "%, 3=" + (int)(dobbelsteenObj[x].getPercDrie() + 0.5) + "%" + "\n" +
                        "                  4=" + (int)(dobbelsteenObj[x].getPercVier() + 0.5) +
                        "%, 5=" + (int)(dobbelsteenObj[x].getPercVijf() + 0.5) +
                        "%, 6=" + (int)(dobbelsteenObj[x].getPercZes() + 0.5) +
                        "%";
                textview.setText(hulpstring);

                d1.bringToFront();
                d1.setVisibility(View.VISIBLE);

                dobbelsteenObj[2].setLaatstGegooid(dobbelsteenObj[1].getLaatstGegooid());
                dobbelsteenObj[2].setPercEen(dobbelsteenObj[1].getPercEen());
                dobbelsteenObj[2].setPercTwee(dobbelsteenObj[1].getPercTwee());
                dobbelsteenObj[2].setPercDrie(dobbelsteenObj[1].getPercDrie());
                dobbelsteenObj[2].setPercVier(dobbelsteenObj[1].getPercVier());
                dobbelsteenObj[2].setPercVijf(dobbelsteenObj[1].getPercVijf());
                dobbelsteenObj[2].setPercZes(dobbelsteenObj[1].getPercZes());

//                volgende.setVisibility(View.VISIBLE);
//                volgende.bringToFront();
            }
        });

        volgende.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.start();

                dobbelsteenObj[x].setLaatstGegooid(dobbelsteenObj[0].getLaatstGegooid());
                dobbelsteenObj[x].setPercEen(dobbelsteenObj[0].getPercEen());
                dobbelsteenObj[x].setPercTwee(dobbelsteenObj[0].getPercTwee());
                dobbelsteenObj[x].setPercDrie(dobbelsteenObj[0].getPercDrie());
                dobbelsteenObj[x].setPercVier(dobbelsteenObj[0].getPercVier());
                dobbelsteenObj[x].setPercVijf(dobbelsteenObj[0].getPercVijf());
                dobbelsteenObj[x].setPercZes(dobbelsteenObj[0].getPercZes());

                geworpen = dobbelsteenObj[x].getLaatstGegooid();

                switch (geworpen) {
                    case 1: d1.setImageResource(R.drawable.dob1); break;
                    case 2: d1.setImageResource(R.drawable.dob2); break;
                    case 3: d1.setImageResource(R.drawable.dob3); break;
                    case 4: d1.setImageResource(R.drawable.dob4); break;
                    case 5: d1.setImageResource(R.drawable.dob5); break;
                    case 6: d1.setImageResource(R.drawable.dob6); break;
                    default: d1.setImageResource(R.drawable.dob6);
                }

                hulpstring =    "Kans op... 1=" + (int)(dobbelsteenObj[x].getPercEen() + 0.5) +
                        "%, 2=" + (int)(dobbelsteenObj[x].getPercTwee() + 0.5) +
                        "%, 3=" + (int)(dobbelsteenObj[x].getPercDrie() + 0.5) + "%" + "\n" +
                        "                  4=" + (int)(dobbelsteenObj[x].getPercVier() + 0.5) +
                        "%, 5=" + (int)(dobbelsteenObj[x].getPercVijf() + 0.5) +
                        "%, 6=" + (int)(dobbelsteenObj[x].getPercZes() + 0.5) +
                        "%";
                textview.setText(hulpstring);

                d1.bringToFront();
                d1.setVisibility(View.VISIBLE);
            }
        });

        d1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                geworpen = dobbelsteenObj[x].getLaatstGegooid();

//                super.onClick(savedInstanceState);
//                setContentView(R.layout.activity_main);
//                context = this;
//                MediaPlayer rolgeluid = MediaPlayer.create(this, R.raw.roll);

//                MediaPlayer rolgeluid = MediaPlayer.create(this,R.raw.roll);

                sound.start();
//                rolgeluid.start();

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

//////////////>> HISTORIE:
//                        System.out.print("oud en nieuww: " + dobbelsteenObj[2].getLaatstGegooid() + " en " + dobbelsteenObj[3].getLaatstGegooid() + "\n");

                        dobbelsteenObj[1].setLaatstGegooid(dobbelsteenObj[2].getLaatstGegooid());
                        dobbelsteenObj[1].setPercEen(dobbelsteenObj[2].getPercEen());
                        dobbelsteenObj[1].setPercTwee(dobbelsteenObj[2].getPercTwee());
                        dobbelsteenObj[1].setPercDrie(dobbelsteenObj[2].getPercDrie());
                        dobbelsteenObj[1].setPercVier(dobbelsteenObj[2].getPercVier());
                        dobbelsteenObj[1].setPercVijf(dobbelsteenObj[2].getPercVijf());
                        dobbelsteenObj[1].setPercZes(dobbelsteenObj[2].getPercZes());

                        dobbelsteenObj[2].setLaatstGegooid(dobbelsteenObj[x].getLaatstGegooid());
                        dobbelsteenObj[2].setPercEen(dobbelsteenObj[x].getPercEen());
                        dobbelsteenObj[2].setPercTwee(dobbelsteenObj[x].getPercTwee());
                        dobbelsteenObj[2].setPercDrie(dobbelsteenObj[x].getPercDrie());
                        dobbelsteenObj[2].setPercVier(dobbelsteenObj[x].getPercVier());
                        dobbelsteenObj[2].setPercVijf(dobbelsteenObj[x].getPercVijf());
                        dobbelsteenObj[2].setPercZes(dobbelsteenObj[x].getPercZes());
//////////////<< HISTORIE

                        geworpen = Worp.vulRij(dobbelsteenObj[x]);
                        dobbelsteenObj[x].setLaatstGegooid(geworpen);
                        bepaalNieuwPerc.doeDan(dobbelsteenObj[x]);
                        geworpen = dobbelsteenObj[x].getLaatstGegooid();

//////////////// !!!!   storeHistory.vastleggenHistorie(dobbelsteenObj[x]);
//// WEG??? >>>
                        d1.setImageResource(R.drawable.dob6);
                        if (geworpen == 1) {
                            d1.setImageResource(R.drawable.dob1);
                        }
//// WEG??? <<<
                        switch (geworpen) {
                            case 1: d1.setImageResource(R.drawable.dob1); break;
                            case 2: d1.setImageResource(R.drawable.dob2); break;
                            case 3: d1.setImageResource(R.drawable.dob3); break;
                            case 4: d1.setImageResource(R.drawable.dob4); break;
                            case 5: d1.setImageResource(R.drawable.dob5); break;
                            case 6: d1.setImageResource(R.drawable.dob6); break;
                            default: d1.setImageResource(R.drawable.dob6);
                        }
                        hulpstring =    "Kans op... 1=" + (int)(dobbelsteenObj[x].getPercEen() + 0.5) +
                                "%, 2=" + (int)(dobbelsteenObj[x].getPercTwee() + 0.5) +
                                "%, 3=" + (int)(dobbelsteenObj[x].getPercDrie() + 0.5) + "%" + "\n" +
                                "                  4=" + (int)(dobbelsteenObj[x].getPercVier() + 0.5) +
                                "%, 5=" + (int)(dobbelsteenObj[x].getPercVijf() + 0.5) +
                                "%, 6=" + (int)(dobbelsteenObj[x].getPercZes() + 0.5) +
                                "%";
                        textview.setText(hulpstring);
                        d1.bringToFront();
                        b8.setVisibility(View.GONE);
                        d1.setVisibility(View.VISIBLE);
                    }
                }, 400);
            }
        });
    }
}
