package ders38_AbstractClasses;

public class DChildClassOfAbstractClass extends  CParentAbstractClass{

     /* Abstract bir class'daki abstract method'ların tamamı
    concrete chıld class'lar tarafından override edilmelidir.
     */

    @Override
    public void mecburiMethod1() {
        System.out.println("child class method icerisinde method'u kendine uyarlar");
    }

    @Override
    public void mecburiMethod2() {

    }
}
