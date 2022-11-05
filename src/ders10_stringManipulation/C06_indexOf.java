package ders10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); //9  // ilk a'nın indexini verir

        System.out.println(str.indexOf('c')); //8

        System.out.println(str.indexOf("hersey")); // 15 birden fazla blok varsa hersey'in (h)

        System.out.println(str.indexOf("e",9)); // 13 // )9 'dan sonra e

        // 13.index'deki e'den bir sonraki e'nin index'ini bulalim

        System.out.println(str.indexOf("e",14)); //16
                // cumldeki 2.'nin indexini yazdırın

        int ilkcindex = str.indexOf("c");//8
        System.out.println(str.indexOf("c",ilkcindex+1));


        System.out.println(str.indexOf("ali")); // -1 index olarak int dondurmesi bekleniyor
        System.out.println(str.indexOf("x")); // -1

    }
}
