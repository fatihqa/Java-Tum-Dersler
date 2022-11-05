package Ders17_Scope;

public class C02_ClassLevelVariables {

    // class level variable ler methodların dısında olusturulur
    // genel kullanım en ustte olusturulmalıdır
    static String hastanneismi="Yıldız hastanesi";
    static int hastaSayisi=23456;  // hasta sayısı tum hastaneyı ılg.ıcın statıc olması lazım
    static String basHekim;
    String persIsmi="İsim girilmedi";
    String persTelefonu="Telefon girilmedi";
    int persYasi;


    public static void main(String[] args) {
        System.out.println(hastanneismi);// Yıldız hastanesi
        System.out.println(basHekim);// null Yazdırır
        //System.out.println(persIsmi);// static olmadıgı ıcın static main method dan kullanılamaz
        /*
        class level variabler'a deger ataması yapılmamıs olursa
        Jaava bu variable lara data turune gore
        default olarak tanımlanna degerlerı atar
        default degerler
        sayısal variable ler icin:0
        boolean : false
        char :'' // hiclik
        objeler(String dahil) için : Null
         */

    }

    public static void method1(){
        System.out.println(hastaSayisi);
        hastaSayisi++;
     //  System.out.println(persIsmi);

    }
    public void method2(){
        System.out.println(hastanneismi); //Yıldız hastanesi
        hastaSayisi++;
        System.out.println(persIsmi);//Isim girilmedi
        System.out.println(persYasi);//0


    }
}
