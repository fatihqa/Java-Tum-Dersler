package ders11_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1= "";
        //str1 'e deger atanmıstır.
        System.out.println(str1); // hiclik
        System.out.println(str1.concat("java"));// java

        String str2;
        // str2' olusturuldu amadeger atanmadı
        //System.out.println(str2); // deger atanmadıgı için yazdirilamaz

        //System.out.println(str2.concat("java")); /// deger atanmadı icin metodla kullanılamaz

        str2="Java candir";
        System.out.println(str2);//
        System.out.println(str2.concat(".")); //

        String str3=null; // str3 ' deger atanmamıstır
                            // null pointer ile java deher atanmadigimizn farkında oldugumuz soyluyoruz
        System.out.println(str3); // null isaretlendigin yazdırı
        /// System.out.println(str3.concat("Java")); // NullPointerException

        System.out.println(str3+"Java"); /// nullJava
    }

}
