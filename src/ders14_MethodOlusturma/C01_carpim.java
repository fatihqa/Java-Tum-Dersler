package ders14_MethodOlusturma;

import java.util.Scanner;

public class C01_carpim {
    public static void main(String[] args) {

        //main method icerisinde kullanıcıdan iki sayı alın
        // bu iki sayıyı parametre olarak kabuk edip carpımlarını main method'a donduren bir method olusturun

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen iki sayi griniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        carpimMethodu(sayi1,sayi2);//15.0

        double carpimSonucu= carpimMethodu(6,2); //12

    }

     public static double carpimMethodu(double sayi1,double sayi2){
         System.out.println("carpim method'u calıstı");
        return sayi1*sayi2 ;
     }


}
