package ders36_checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fis= new FileInputStream("src/ders36_checkedExceptions/Deneme.txt");

        FileOutputStream fos= new FileOutputStream("src/ders36_checkedExceptions/Deneme.txt");

         // Java ile bilgisayaramızdaki bir dosyaya ulasmka istersek fileInputStream class'indan obje olusturup
         // o obje araciligiyla dosyayi okuyabiliriz
         // fis olustururken  ulasmak istedigimiz dosyani dosya yolunu parametre olarak girmeliyiz

        /* Checked exception olustuma ıhtımalı olan kodları  yazdıgımızda
     Java Compıle Tıme orada bır hata ıhtımalı oldugunu gorur
      ve kodun altını kırmızı olarak çızer
      bu durumda kırmızı çizgiyi kaldırmak için 2(iki) yöntem vardır.
      1- Exception'u TRY CATCH blogu ile handle etmek
      2- Java'ya sorun ihtimalinin farkında olduğumuzu ama kodumuza güvendiğimizi ve
      çalışmaya devam etmesini istediğimizi söylemek
      bunun için method signature'a method declarasyonu ile curly braces arasına throws keyword
      ve beklenen exceptıon turu yazılabilir
     */

    }
}
