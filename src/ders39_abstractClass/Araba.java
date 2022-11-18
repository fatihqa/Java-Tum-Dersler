package ders39_abstractClass;

public abstract class Araba {

    //Araba class'ini inherit eden tum class'lar
    // motor kasa tekerlek methodlarini override etmek zorunda kalsin
    //Ancak abs clima methodlari opsiyonel olsun
    // isteyen child bu methodlari override etsin isteyen etmesin

    public abstract  void marka();


    public abstract void motor();


    public abstract void kasa();


    public abstract void tekerlek();

    public void abs(){
        System.out.println("Guveklik artırmak isteyen arablar abs kullanmali");
    }
    public void klima(){
        System.out.println("konfor artirmak isteyen arabalar klima kullanmali");
    }

}
