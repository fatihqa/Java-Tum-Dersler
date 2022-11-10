package ders02_Datatürleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismin alıp büyük harflerle yazdırın

        //1. adım scan objesi oluşturma
        Scanner scan = new Scanner(System.in);
        //2. adım kullanıcıya ne istediğimizi yazdırma
        System.out.println("Lutfen adınızı giriniz");
        //3. adım kullanıcıdan istediğimiz bilginin turune uygun bir variable olusturup
        //   scanner Method'larından uygun olanını kullanarak alınan degeri
        //    variable'a atayabilme
        String kullaniciAdı= scan.next();

        System.out.println(kullaniciAdı.toUpperCase());


    }
}
