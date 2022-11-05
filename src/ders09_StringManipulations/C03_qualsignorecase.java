package ders09_StringManipulations;

public class C03_qualsignorecase {
    public static void main(String[] args) {

        String str1 = "Ali" ;
        String str2 = "ali" ;
        String str3 = "ALI" ;

        System.out.println(str1.equals(str2));///false        // equal hepsinin aynı olmasını ister
        System.out.println(str1.equals(str3)); // false

        System.out.println(str1.equalsIgnoreCase(str2)); // true       //
        System.out.println(str1.equalsIgnoreCase(str3)); //true

        System.out.println(str1.equalsIgnoreCase("ali "));//false   // metin tamamen aynı olacak. büyük kücük
                                                                                // duyarlılıgı kaldır metni kabul ettirir.
        /*
        equalsignoreCase ayin metnin buyuk kucuk harf kullanılarak oluşturulan
         farklı yazılımlarıı birbirine esit olarak kabul eder

        yani equalsIgnoreCase için ali, ALI, Alı, aLI, alI biribrne eşittir
        ama kelimede farklılık varsa bunları tolere etmez
        a li ile ali birbirne esit degildir
        ali ALI birbirne esit değildir // bosluk yada karakter varsa false EDER::

         */
    }
}
