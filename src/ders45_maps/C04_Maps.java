package ders45_maps;

import ders44_maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {
        //ogrenci map inde numarası verilen sayilarin arasinda
        // bir method olusturun

        Map<Integer,String > ogenciMap= MapDepo.ornekMapOlustur();

        int basNo=103;
        int bitNo=107;
        List<String > isimListesi=MapDepo.numaraDegerineGoreListeOlustur(ogenciMap,basNo,bitNo);





    }
}
