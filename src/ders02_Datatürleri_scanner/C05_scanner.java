package ders02_Datatürleri_scanner;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {
        //soru2 - Kullanıcıdan bir double bir de int sayi alıp
        // bunların toplamını ver carpımını yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ondalıklı bir sayı girin");
        double ondalıklıSayi= scan.nextDouble();
        System.out.println("Lutfen bir tam sayı giriniz");
        int tamSayi = scan.nextInt();
        System.out.println(ondalıklıSayi+tamSayi);
        System.out.println(ondalıklıSayi*tamSayi);






    }
}
