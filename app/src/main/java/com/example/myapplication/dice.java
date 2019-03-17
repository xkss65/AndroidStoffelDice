package com.example.myapplication;

public class dice {
    private double percEen;
    private double percTwee;
    private double percDrie;
    private double percVier;
    private double percVijf;
    private double percZes;
    private int laatstGegooid;

    public int getLaatstGegooid() {
        return laatstGegooid;
    }

    public void setLaatstGegooid(int laatstGegooid) {
        this.laatstGegooid = laatstGegooid;
    }

    // standard getters and setters

    public double getPercEen() {
        return percEen;
    }

    public void setPercEen(double percEen) { this.percEen = percEen; }

    public double getPercTwee() {
        return percTwee;
    }

    public void setPercTwee(double percTwee) {
        this.percTwee = percTwee;
    }

    public double getPercDrie() {
        return percDrie;
    }

    public void setPercDrie(double percDrie) {
        this.percDrie = percDrie;
    }

    public double getPercVier() {
        return percVier;
    }

    public void setPercVier(double percVier) {
        this.percVier = percVier;
    }

    public double getPercVijf() {
        return percVijf;
    }

    public void setPercVijf(double percVijf) {
        this.percVijf = percVijf;
    }

    public double getPercZes() {
        return percZes;
    }

    public void setPercZes(double percZes) {
        this.percZes = percZes;
    }

    public dice(double percEen, double percTwee, double percDrie, double percVier, double percVijf, double percZes) {
        this.percEen = percEen;
        this.percTwee = percTwee;
        this.percDrie = percDrie;
        this.percVier = percVier;
        this.percVijf = percVijf;
        this.percZes = percZes;
    }
}
