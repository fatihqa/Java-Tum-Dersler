package fatihdeneme;

import java.util.Scanner;

public class D04ifelsestatements {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfeen yasınızı giriniz");
        double yas=scan.nextDouble();

        if (yas>=65) {
            System.out.println("yasınız emeklilik için yeterli");

        }else {
            System.out.println("emeklik olmak için:" + (65-yas)+ "sene daha çalışmalısınız");

        }
    }
}
