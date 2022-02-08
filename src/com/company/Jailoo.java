package com.company;

public class Jailoo {
    private String jailo;
    private String adress;
    private String chaban;
    private Ui[] uilar;
    private Koi[] koilor;
    private At[] attar;

    public Jailoo() {
    }

    public Jailoo(String jailo, String adress, String chaban, Ui[] uilar, Koi[] koilor, At[] attar) {
        this.jailo = jailo;
        this.adress = adress;
        this.chaban = chaban;
        this.uilar = uilar;
        this.koilor = koilor;
        this.attar = attar;
    }

    public String getJailo() {
        return jailo;
    }

    public void setJailo(String jailo) {
        this.jailo = jailo;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getChaban() {
        return chaban;
    }

    public void setChaban(String chaban) {
        this.chaban = chaban;
    }

    public Ui[] getUilar() {
        return uilar;
    }

    public void setUilar(Ui[] uilar) {
        this.uilar = uilar;
    }

    public Koi[] getKoilor() {
        return koilor;
    }

    public void setKoilor(Koi[] koilor) {
        this.koilor = koilor;
    }

    public At[] getAttar() {
        return attar;
    }

    public void setAttar(At[] attar) {
        this.attar = attar;
    }
}
