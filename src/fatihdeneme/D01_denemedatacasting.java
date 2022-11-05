package fatihdeneme;

import java.util.Scanner;

public class D01_denemedatacasting {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir tam sayı girin ");

        int girilenSayi = scan.nextInt();

        byte donusenSayi= (byte)girilenSayi;

        System.out.println("girdiğiniz" + girilenSayi +"nin donusmus hali:" + donusenSayi);




    }
}
