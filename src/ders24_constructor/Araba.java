package ders24_constructor;

public class Araba {
    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;

    public Araba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    int fiyat;

    public Araba(String marka, String model, String yakit) {
       this.marka = marka;
        this.model = model;
        this.yakit = yakit;
    }

    public Araba(String mrk, String mdl){
        marka=mrk;
        model=mdl;

    }
    public Araba(){

    }

    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat;
    }
}