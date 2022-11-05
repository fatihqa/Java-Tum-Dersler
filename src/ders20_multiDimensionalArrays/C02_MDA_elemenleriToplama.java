package ders20_multiDimensionalArrays;

public class C02_MDA_elemenleriToplama {
    public static void main(String[] args) {

        int[] arr1={3,5,7,8};//23

        int toplam=0;

        for (int i = 0; i < arr1.length ; i++) {

            toplam+= arr1[i];


        }

        System.out.println("Tek katli elemenler toplamı : "+ toplam);


    }
}
