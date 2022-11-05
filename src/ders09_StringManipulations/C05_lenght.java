package ders09_StringManipulations;

public class C05_lenght {                       // SON KAARAKTERİ BULMAK İÇİN..////
    public static void main(String[] args) {

        String str = "Uzunkavaklaraltındayataruyumazoglu";

        System.out.println(str.length()); //34

        //  son karakteri yazdırın ?

        System.out.println(str.charAt(33));
        System.out.println(str.charAt(str.length()-1));// son karakteri elde etmek için kullanılr

        //sondan 3. karakteri yazdırın _

        System.out.println(str.charAt(str.length()-3));// g






    }
}
