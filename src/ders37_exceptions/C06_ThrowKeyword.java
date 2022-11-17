package ders37_exceptions;

import java.util.Scanner;

public class C06_ThrowKeyword {
    public static void main(String[] args) {
        //kullanıcıdan yasını isteyin
        // eger 0 veya negatif bir sayi girerse uyari olrak
        // illegal argumentException uyarisi verin
        // ancak kodunuz normal calısmaya devam etsin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasınızı giriniz");
        int yas = scan.nextInt();

        if (yas<=0){

            try {
                throw  new IllegalArgumentException();

            } catch (IllegalArgumentException e) {
               e.printStackTrace();
                System.out.println("Yas 0 veya negatif olamaz");
            }
        }

    }
}
