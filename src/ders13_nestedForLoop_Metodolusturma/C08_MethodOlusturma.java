package ders13_nestedForLoop_Metodolusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {
    public static void main(String[] args) {
        /*
        kullanıcıdan 2 sayı alıp bunların toplamını yadıran bir method oluşturun


       */


        isteToplaYazdir();
        isteToplaYazdir();

    }
    public static void isteToplaYazdir(){Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ıkı sayı girin");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println("girilen sayıların toplmı: "+(sayi2+sayi1));

    }

}
