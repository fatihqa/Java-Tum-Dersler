package ders26_passByvalue_ImmutableClasses;

import java.util.Arrays;
import java.util.List;

public class C03_PassByValueArray {
    public static void main(String[] args) {

        // verilen bir array'i elemneleri 5 artırıp
        //sonra yazdiran bir method olusturun

        int [] arr={3,4,5};

        elemenleri5Artir(arr);
        elemenleri5Artir(arr);
        elemenleri5Artir(arr);
        System.out.println("Method call dan sonra method icinde arr : "+Arrays.toString(arr));
    }
    public static void elemenleri5Artir(int []arr){

        for (int i = 0; i < arr.length ; i++) {

            arr[i]=arr[i]+5;

        }
        System.out.println(Arrays.toString(arr));
    }

}
