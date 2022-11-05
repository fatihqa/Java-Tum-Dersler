package fatihdeneme.Array;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArralistFibonacci {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir pozitif tamsayi giriniz");
        int girilenSayi=scan.nextInt();

        if(girilenSayi<0){
            System.out.println("Fibonacci için 0 dan buyuk tam sayi girmelisin");
        } else if (girilenSayi==0) {
            System.out.println("o dan kucuk fibonacci yoktur");

        }else if(girilenSayi==1){
            System.out.println("1'den kuuck fibnacci sayisi vardir:0");
        }else{
            fibonaccisayilariniYazdir(girilenSayi);
        }

    }

    private static void fibonaccisayilariniYazdir(int girilenSayi) {
        // buraya geldiyse girilen sayi 1 den buyuk

        List<Integer> fibonacciListesi=new ArrayList<>();
        fibonacciListesi.add(0);
        fibonacciListesi.add(1);
        fibonacciListesi.add(1);

        int yeniFibonacciSayisi=0;
        int index=3; // ilk 3 eleman 0 11 old için 3,index'e geldik

        while (yeniFibonacciSayisi<girilenSayi);
        yeniFibonacciSayisi=fibonacciListesi.get(index-2)+ fibonacciListesi.get(index-1);

        if (yeniFibonacciSayisi<girilenSayi){
            fibonacciListesi.add(yeniFibonacciSayisi);
        }
        index++;





    }
}
