package ders31_inheritance;


public class DOtomobil extends BinekArac {
    public static void main(String[] args) {

        DOtomobil oto1=new DOtomobil();
        System.out.println(oto1.marka);

        // inheritance sayesinde bir child class olusturdugumuzda yeni hib bir
        // variable veya method olusturmadan
        // parent class(lar)'daki yum ozellikleri almıs oluruz
        //Child class da parent class dan gelen ozellikleri update edebilip
        // veya yeni ozzellikler ekleyebiliriz


    }
}
