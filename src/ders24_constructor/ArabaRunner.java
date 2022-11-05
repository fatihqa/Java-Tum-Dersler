package ders24_constructor;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1= new Araba();

        arb1.marka="Citrone";
        arb1.model="C3";
        arb1.yakit="Benzin";
        arb1.fiyat=20000;
        arb1.fiyat =2020;

        System.out.println(arb1);

        Araba arb2= new Araba("Volvo","CX60");

        System.out.println(arb2);

        Araba arb3=
                new Araba("Hyundai",",10","10000");
        System.out.println(arb3);

        Araba arb4=new Araba("Porche","cayan","lpg",1990,120000);
        System.out.println(arb4);
    }
}
