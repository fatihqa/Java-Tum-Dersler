package ders14_MethodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        // bu iki sayının carpım sonucunu yeni kod yazmadan konsola yazdırın
        System.out.println(C01_carpim.carpimMethodu(a, b)); ///200.0

        String c = "Nasil";
        String d= "yani";
        // bu ıkı Stringi aralarında bosluk bırakarak yazdırın
        System.out.println(ders14_MethodOlusturma.C02_StringConcate.birlestirMethodu(c, d)); //nasil yani

        String e="Bu da mi oldu";
        // e String'ini terseten yazdırın
        System.out.println(C03_StringTerseCevirme.stringiTerseCevir(e)); //udlo im ad uB

        //"Bu cumleyi terse cevirin"

        System.out.println(C03_StringTerseCevirme.stringiTerseCevir("Bu cumleyi terse cevirin")); //nirivec esret iyelmuc uB

        String str="Java ok guzel";
        //Str i buyuk harf olarak yazdırın
        System.out.println(str.toUpperCase()); //JAVA OK GUZEL

    }

}
