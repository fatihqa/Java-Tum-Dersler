package ders09_StringManipulations;

public class C07_substring {
    public static void main(String[] args) {

        String str= "Java gun gectıkce guzellesiyor" ;

        System.out.println(str.substring(5,8));// gun
        // 5. indexten baslar 8-5 karakter yazdırır
        //  5. index dahil (inclusive), 8. index haric (exclusive)

        System.out.println(str.substring(9,17)); // gectikce

        System.out.println(str.substring(3,7)); // a gu

        String isim = "huseYIN" ;
        // verilen isimi ilk harfi buyuk geriye kalanlar kucuk harf olarak kaydedın.

        isim= isim.substring(0,1).toUpperCase()+ //ilk harfi alıp buyuk harf yaptık
        isim.substring(1).toLowerCase();

        System.out.println(isim);//

        //sadece 3. indexteki harfi harfi yzdırın s

        System.out.println(isim.substring(3,4));// e

        System.out.println("zor sorunun cevabı : "+ isim.substring(2,2)); // hiclik yazdırır

       // System.out.println(isim.substring(5,2)); // StringIndexOutOfBoundsException




    }
}
