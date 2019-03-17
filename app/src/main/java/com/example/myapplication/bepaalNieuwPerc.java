package com.example.myapplication;

import java.text.DecimalFormat;

public class bepaalNieuwPerc {

    static void doeDan(dice dobbelsteenObj) {
        double percEen; double percTwee; double percDrie;
        double percVier; double percVijf; double percZes;
        int laatstGegooid = dobbelsteenObj.getLaatstGegooid();
//        System.out.print("laatstGegooid: " + laatstGegooid + "\n");

        percEen = dobbelsteenObj.getPercEen(); percTwee = dobbelsteenObj.getPercTwee();
        percDrie = dobbelsteenObj.getPercDrie(); percVier = dobbelsteenObj.getPercVier();
        percVijf = dobbelsteenObj.getPercVijf(); percZes = dobbelsteenObj.getPercZes();

//        DecimalFormat df = new DecimalFormat("#.##");
//        percEen = Double.valueOf(df.format(percEen));
//        percTwee = Double.valueOf(df.format(percTwee));
//        percDrie = Double.valueOf(df.format(percDrie));
//        percVier = Double.valueOf(df.format(percVier));
//        percVijf = Double.valueOf(df.format(percVijf));
//        percZes = Double.valueOf(df.format(percZes));

//WEG>>>>>>>>>>>
        double percEenOud = percEen;
        double percTweeOud = percTwee;
        double percDrieOud = percDrie;
        double percVierOud = percVier;
        double percVijfOud = percVijf;
        double percZesOud = percZes;
//WEG<<<<<<<<<<<

        percEen = percEen + 0.24; percTwee = percTwee + 0.24; percDrie = percDrie + 0.24;
        percVier = percVier + 0.24; percVijf = percVijf + 0.24; percZes = percZes + 0.24;

        switch (laatstGegooid) {
            case 1: percEen = percEen - 1.44; break;
            case 2: percTwee = percTwee - 1.44; break;
            case 3: percDrie = percDrie - 1.44; break;
            case 4: percVier = percVier - 1.44; break;
            case 5: percVijf = percVijf - 1.44; break;
            case 6: percZes = percZes - 1.44; break;
            default: System.out.print("Er is iets raars aan de hand; laatstGegooid: " + laatstGegooid + "\n");
        }
//WEG>>>>>>>>>>>
//        double verschilEen = percEen - percEenOud;
//        double verschilTwee = percTwee - percTweeOud;
//        double verschilDrie = percDrie - percDrieOud;
//        double verschilVier = percVier - percVierOud;
//        double verschilVijf = percVijf - percVijfOud;
//        double verschilZes = percZes - percZesOud;
//        System.out.print("bepaalNieuwPerc.java" + "\n");
//        System.out.print("percEenOud: " + percEenOud + "=> percEen: " + percEen + "= verschilEen: " + verschilEen + "\n");
//        System.out.print("percTweeOud: " + percTweeOud + "=> percTwee: " + percTwee + "= verschilTwee: " + verschilTwee + "\n");
//        System.out.print("percDrieOud: " + percDrieOud + "=> percDrie: " + percDrie + "= verschilDrie: " + verschilDrie + "\n");
//        System.out.print("percVierOud: " + percVierOud + "=> percVier: " + percVier + "= verschilVier: " + verschilVier + "\n");
//        System.out.print("percVijfOud: " + percVijfOud + "=> percVijf: " + percVijf + "= verschilVijf: " + verschilVijf + "\n");
//        System.out.print("percZesOud: " + percZesOud + "=> percZes: " + percZes + "= verschilZes: " + verschilZes + "\n");
//WEG<<<<<<<<<<<

        dobbelsteenObj.setPercEen(percEen);
        dobbelsteenObj.setPercTwee(percTwee);
        dobbelsteenObj.setPercDrie(percDrie);
        dobbelsteenObj.setPercVier(percVier);
        dobbelsteenObj.setPercVijf(percVijf);
        dobbelsteenObj.setPercZes(percZes);
    }
}
