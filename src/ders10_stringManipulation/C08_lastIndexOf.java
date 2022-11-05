package ders10_stringManipulation;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str = "Java hafiften beyin yakıyor";
        System.out.println(str.lastIndexOf("a")); // 21  /// sondan 'a' aramaya baslayacak ama bastan sayar

        System.out.println(str.lastIndexOf('e')); // 15
        System.out.println(str.lastIndexOf("java"));// 'kucuk j oldugu ıcın -1 olur

        System.out.println(str.lastIndexOf("java")); /// 0

        str.lastIndexOf("e",14); // 11 //14 baslar geri dogru e yi arar




    }
}
