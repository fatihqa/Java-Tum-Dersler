package MapsDeneme;

import ders44_maps.MapDepo;

import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlustur();

        System.out.println(ogrenciMap.get(104));

        int ogrenciKey=104;
        String isimSoyisim= MapDepo.isimSoyisimDondur(ogrenciMap,ogrenciKey);
        System.out.println(ogrenciKey+" isimm "+ isimSoyisim);
    }
}
