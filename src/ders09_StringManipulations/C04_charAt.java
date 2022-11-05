package ders09_StringManipulations;

public class C04_charAt {
    public static void main(String[] args) {

        String str = "Java Candşr" ;

        System.out.println(str.charAt(0)); // ilk harfi verir J

        System.out.println(str.charAt(5)); // 5. indexteki char'ı verir

        System.out.println();  // bana sonucu karakteri yzdırın ?

        System.out.println(str.charAt(10));

        /*
        bir metindeki karakter sayısı ile son index arasında 1 fark vardır
        bu metin için karakter sayısı 11 ama
         son index 10

         */

        System.out.println(str.charAt(11));//.StringIndexOutOfBoundsException: sınırların dısında demek





    }
}
