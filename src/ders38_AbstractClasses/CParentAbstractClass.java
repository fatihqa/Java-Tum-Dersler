package ders38_AbstractClasses;

public abstract  class CParentAbstractClass {

    /*
    Abstract bir class abstract methodlara sahip olabilir.
    Bir class'i abstract yapmak icin class declaration'a abstract keyword eklenmelidir

     */
    public abstract void  mecburiMethod1();

    public abstract  void mecburiMethod2();
    //soyut(abstract) methodlarin body'si olmaz

    public void concreteMethod(){
        // bugune kadar kullandıgımız normal methodlara soyut olmayan method demek yerine
        // Concrete method denir
    }

   /*
Bir parent class'da child class'ların mutlaka override edeceği bir method olusturdugumuzda
method body'si gereksizlerşir cünkü hiç çalışmayacaktır

1- Abstract Parent class'dan obje oluşturulamayacağı için objeler için bu method kullanılamaz
2-Chıld class'larda mecburen bu method'u override edeceklerinden, bu merhod'ların body'si asla
KULLANILMAYACAKTIR.
Java hiç kullanılmayacak bu method body'leri yazmamamıza imkan tanımıştır.

Chıld class'ların mutlaka override etmesini istediğimiz method'ları abstract olarak tanımlar ve
body'siz olarak oluştururuz.
 */
}
