package com.example.myapplication;

import java.util.Arrays;
import java.util.Random;

public class Worp {

    static int vulRij(dice dobbelsteenObj) {
        double eenDouble = dobbelsteenObj.getPercEen() * 6;
        int een = (int) (eenDouble + 0.5);
        double tweeDouble = dobbelsteenObj.getPercTwee() * 6;
        int twee = (int) (tweeDouble + 0.5);
        double drieDouble = dobbelsteenObj.getPercDrie() * 6;
        int drie = (int) (drieDouble + 0.5);
        double vierDouble = dobbelsteenObj.getPercVier() * 6;
        int vier = (int) (vierDouble + 0.5);
        double vijfDouble = dobbelsteenObj.getPercVijf() * 6;
        int vijf = (int) (vijfDouble + 0.5);
        double zesDouble = dobbelsteenObj.getPercZes() * 6;
        int zes = (int) (zesDouble + 0.5);

//WEG>>>>>>>>>>>
//        double tempEen = dobbelsteenObj.getPercEen();
//        double tempTwee = dobbelsteenObj.getPercTwee();
//        double tempDrie = dobbelsteenObj.getPercDrie();
//        double tempVier = dobbelsteenObj.getPercVier();
//        double tempVijf = dobbelsteenObj.getPercVijf();
//        double tempZes = dobbelsteenObj.getPercZes();
//        System.out.print("PercEen: " + tempEen + " => eenDouble: " + eenDouble + " => " + een + "\n");
//        System.out.print("PercTwee: " + tempTwee + " => tweeDouble: " + tweeDouble + " => " + twee + "\n");
//        System.out.print("PercDrie: " + tempDrie + " => drieDouble: " + drieDouble + " => " + drie + "\n");
//        System.out.print("PercVier: " + tempVier + " => vierDouble: " + vierDouble + " => " + vier + "\n");
//        System.out.print("PercVijf: " + tempVijf + " => vijfDouble: " + vijfDouble + " => " + vijf + "\n");
//        System.out.print("PercZes: " + tempZes + " => zesDouble: " + zesDouble + " => " + zes + "\n");
//WEG<<<<<<<<<<<

        Random willekeurig = new Random();
        int zoveelste = 0;
        int geworpen = 0;

        int vlak[] = new int[600];
        for(int i=0;i<een;i++)
            vlak[i] = 1;
        for(int i=een;i<(een + twee);i++)
            vlak[i] = 2;
        for(int i=(een + twee);i<(een + twee + drie);i++)
            vlak[i] = 3;
        for(int i=(een + twee + drie);i<(een + twee + drie + vier);i++)
            vlak[i] = 4;
        for(int i=(een + twee + drie + vier);i<(een + twee + drie + vier + vijf);i++)
            vlak[i] = 5;
        for(int i=(een + twee + drie + vier + vijf);i<(vlak.length - 1);i++)
            vlak[i] = 6;

        zoveelste = willekeurig.nextInt(600);
//        System.out.print("zoveelste: " + zoveelste + "\n");
        geworpen = vlak[zoveelste];

        return geworpen;
    }
}
