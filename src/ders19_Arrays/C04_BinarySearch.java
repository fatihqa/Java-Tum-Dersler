package ders19_arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {

        int [] arr= {1,8,9,3,7,2,5,8,1};


        /*
        Binary search method'unun dogru sonuclar verebilmesi için onccelıkle
        sort method'u kullanılmalı

        sort() kullanmadan binarySearch() ile yapilan aramanın sonucu belli olmaz
        dogru sonuc da verebilir , yanlıs sonuc da
         */

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,8));//6
        System.out.println(Arrays.binarySearch(arr,5));//4
        System.out.println(Arrays.binarySearch(arr,1));//1
        System.out.println(Arrays.binarySearch(arr,9));//8


        // array de eleman aratırsak
        // java once  o sayı array de olsa onu bulur
        // sonra buldugu bu SIRA'yi - eksi isareti ile verir

        System.out.println(Arrays.binarySearch(arr,-3));//-1
        System.out.println(Arrays.binarySearch(arr,4));//-5
        System.out.println(Arrays.binarySearch(arr,10));//-10
        System.out.println(Arrays.binarySearch(arr,100));//-10

    }
}
