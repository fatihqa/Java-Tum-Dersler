package fatihdeneme.Array;

import java.util.ArrayList;
import java.util.List;

public class Set {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};
        // list.set(index, yeniDeger) method'u
        // istenen index'deki eski degeri silip bize dondurur
        // ve o indexdeki degeri verdigimiz yeni deger olarak atar
        List<Integer> sayilar= new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }

        sayilar.set(0,7);
        System.out.println(sayilar);
        System.out.println(sayilar.set(4, 4));
    }
}
