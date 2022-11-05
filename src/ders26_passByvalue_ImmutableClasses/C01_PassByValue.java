package ders26_passByvalue_ImmutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {

        double fiyat=200;

        System.out.println(indirimUygula(fiyat));///90

        System.out.println(fiyat);// 100
        fiyat=indirimUygula(fiyat);
        System.out.println(fiyat);//180
    }

    /*
    kodlarımızn anlasılır olması icin main methoda dan diger methodlara
     parametre olarak gonderdigimiz variable ler icin ayni simli variable olursturmayı tercih ederiz.

     Java Methodlar rasında gecı yaparken variable degil
     variable nin value'sini pass eder

     Bu java'nin pass by value 'yu tercih etmeesinden kaynaklanıyor

     Eger method'un icerisnde yaptiginz degiskligin mian method icin de gecerli olmasını isterseniz main method icerisnde 4
     fiyat=indirimUygula(fiyat)
     atamasını yapabiliriz
     */
    public    static double indirimUygula( double ahmet) {
        //%10 indirim yapsin

        ahmet=ahmet*0.9; // fiyata atama yaptık kalici olarak 90 oldu
        return ahmet;
    }
}
