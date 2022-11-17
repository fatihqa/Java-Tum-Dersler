package fatihdeneme;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alip
        // o sayinin karesini yazdiran
        // kullanici ondalikli sayi girerse kullaniciya uyari yazisi yazdirip
        // tekrar sayi isteyen bir method olusturun

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi=scan.nextInt();
        System.out.println("Girdiginiz sayinin karesi");
        System.out.println(girilenSayi*girilenSayi);





    }
}
