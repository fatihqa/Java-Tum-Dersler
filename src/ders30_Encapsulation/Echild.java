package ders30_Encapsulation;

public class Echild extends Dparent {

    /*
   Java daki inharitance'in insanlardan en buyuk farkı :
   insanlarda paranet child edinebilir ama child parant'ini secamez
   Javada ise tam tersidir
   -Siz bir class olusturdugunuzda daha once olusturulmus class'larda tum oelliklerini
   inherit etmek istediginiz class'i PARENT EDINIRSINIZ
    Bir class baska bir class i inherit etmek istediginde extend keyword ile bunu deklare eder
     */
    public static void main(String[] args) {

        Echild child1= new Echild();

        child1.yas=30;
        child1.isim="Fatih";
        child1.isEnough= false;
    }
}
