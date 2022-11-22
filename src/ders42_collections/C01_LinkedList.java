package ders42_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        LinkedList<String >ll1=new LinkedList<>();
        //LinkedList 3 tane interface'yi implement etmistir
        //List,Queue,Deue interfacleri
        //Dolayısıyle bu ınterfacelerden sonra gelen ilk concrete class old.
        //Bu 3 interfacede ki tum abstract methodlari override etmistir

        //LinkedList

        List<String>ll2=new LinkedList<>();

        ll2.add("R");

        ll2.add("Z");

        ll2.add(0,"A");
        System.out.println(ll2);

        ll2.set(3,"M");
    }
}
