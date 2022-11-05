package fatihdeneme;
import java.util.Scanner;
public class kartvarmi {
    public static void main(String[] args) {
        // Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, 10 urunden az ise  %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, 10 urunden az ise  %10 indirim yapin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen urun adedi ve liste fiyatini giriniz");
        int urunAdedi=scan.nextInt();
        double listeFiyati=scan.nextDouble();
        System.out.println("a kartiiz varsa 1 i yoksa 2 yi giriniz");
        int kart= scan.nextInt();
        if (kart==1){
            if (urunAdedi>10){
                System.out.println("Toplam tutar: "+(urunAdedi*listeFiyati*80/100));
                System.out.println("Toplam tutar: "+ ((urunAdedi*listeFiyati)-(urunAdedi*listeFiyati*20/100)));
                System.out.println("Toplam tutar: " + urunAdedi*listeFiyati*0.80);
            }else {
                System.out.println("Toplam tutar: "+(urunAdedi*listeFiyati*85/100));
            }
        } else if (kart==2) {
            if (urunAdedi>10){
                System.out.println("Toplam tutar: "+(urunAdedi*listeFiyati*0.85));
            }else {
                System.out.println("Toplam tutar: "+ (urunAdedi*listeFiyati*0.90));
            }

        }else {
            System.out.println("Yanlis giris yaptiniz");
        }
    }
}