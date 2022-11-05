package ders26_passByvalue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {
        // bir method olusturalim ve method'da list'deki sayilari 5 artiralim
// ve method'da listenin son halini yazdiralim


        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        elemenleri5artir(sayilar);

        // Meyhod call sonrasi mein method icersinde Listi tekrar yazdıralım
        System.out.println("Method call sonrasi main methodta List: " +sayilar);
    }
    public static void elemenleri5artir(List<Integer>sayilar){

        for (int i = 0; i <sayilar.size() ; i++) {

            sayilar.set(i,sayilar.get(i)+5);

        }
        System.out.println(sayilar);

    }
}
