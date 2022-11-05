package ders25_staticKeyword;

public class C02_StaticBlock {

    static {
        System.out.println("2.static block calıstı");
    }

    static {
        System.out.println("1.statik blok  calıstı");

    }               // main method dan önce calısır

    public static void main(String[] args) {
        System.out.println("main method calıstı");
    }
}
