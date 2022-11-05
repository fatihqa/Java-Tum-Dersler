package fatihdeneme;

import java.util.Scanner;

public class D07_whileloop {
    public static void main(String[] args) {

         /*
          Kullanicidan toplanmak uzere sayi alin
          sayilarin toplami 500'e esit olur veya gecerse
          girilen sayi adedi,
          girilen sayilarin toplamini ve
          "Bu kadar yeter" yazdirin
         */

        Scanner scan= new Scanner(System.in);
        double girilenSayi=0;
        double toplam=0;
        int sayac=0;
        while(toplam<500){
            System.out.println("toplanmak icin sayi giriniz");
            girilenSayi=scan.nextDouble();

            toplam+=girilenSayi;
            sayac++;


        }
        System.out.println("girilen " +sayac+ " sayini toplamı : "+ toplam + " oldu.Bukdar yeter");
    }
}
