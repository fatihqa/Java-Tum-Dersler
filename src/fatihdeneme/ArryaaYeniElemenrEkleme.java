package fatihdeneme;

import java.util.Arrays;

public class ArryaaYeniElemenrEkleme {
    public static void main(String[] args) {
        int[] arr= {2,4,6};

        // bu arr'e 4.bir element olarak 8 ekleyelim

        /*
          Var olan bir array'e yeni eleman eklenemez
          ama yeni deger atanabilir
          once int[] arr2= [2, 4, 6, 8] seklinde yeni bir array olusturup
          sonra arr2 degerini arr'ye atayabilirim
         */

        // yeni array olusturalim
        // arr2'e konulacak datalarin turu
        // uzunlugu ise eski array'in uzunlugunun 1 fazlasi

        int[] arr2= new int[arr.length+1];
        for (int i = 0; i < arr.length ; i++) {
            arr2[i]=arr[i];

        }
        System.out.println(Arrays.toString(arr));
    }
}
