package fatihdeneme;

import java.util.ArrayList;
import java.util.List;

public class araylist_elementEkleme {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        System.out.println(sayilar);

        System.out.println(sayilar.add(5));
        System.out.println(sayilar);

        sayilar.add(20);
        System.out.println(sayilar); //[5, 20]
// listenin basina 44 ekleyin

        sayilar.add(0,10);
        System.out.println(sayilar);

        List<Integer> eklenecekListe= new ArrayList<>();

        eklenecekListe.add(5);
        eklenecekListe.add(10);
        sayilar.addAll(eklenecekListe);
        System.out.println(sayilar);

        // sayilar listesinin basindaki 44'den sonraya eklenecek listeyi ekleyin

        sayilar.addAll(1,eklenecekListe);
        System.out.println(sayilar);
    }


}
