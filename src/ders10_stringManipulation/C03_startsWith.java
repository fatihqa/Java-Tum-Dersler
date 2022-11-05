package ders10_stringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {

        String str= "manti acarken java  ogrenilmez";

        System.out.println(str.startsWith("Manti")); // false

        System.out.println(str.startsWith("m")); //ture

        System.out.println(str.startsWith("manti acarken java ogrenilmez"));

        System.out.println(str.startsWith("")); //true

        System.out.println(str.startsWith("acarken", 6)); /// 6. index ve sonrası acarken ile mi baslıyor demek

        System.out.println(str.startsWith("manti",0));// true         //0. index ve sonrası manit ile baslıyor

        System.out.println(str.startsWith("java",10)); //false

    }
}
