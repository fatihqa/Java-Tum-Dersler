package ders26_passByvalue_ImmutableClasses;

import java.util.Arrays;

public class C05_PassByValueArray2 {
    public static void main(String[] args) {
        //bir method olusturun
        // sayilar Array'inin uzunlugunda iki fazla olan
        // ve elemenlerin tamami 5 olan yeni bir arry olusturup
        //deger olarak saiylar array'ine atayin ve Sayialr ARrray ini yazdirin

        int[]sayilar={3,4,5};
        arrayeYeniDegerAta(sayilar);
        System.out.println(Arrays.toString(sayilar));
    }
    public static void arrayeYeniDegerAta(int[]sayilar){

        int[] yeniArray=new int[sayilar.length+2];

        for (int i = 0; i <yeniArray.length ; i++) {
            yeniArray[i]=5;
        }

        sayilar=yeniArray;

        System.out.println("Method da sayilarin son hali"+Arrays.toString(sayilar));
    }
}
