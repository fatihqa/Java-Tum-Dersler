package Ders17_Scope;

import java.util.Scanner;

public class C05_ObjectVariables {
    public static void main(String[] args) {

        //C03 callasındakı instance variable lara nasıl ulasabılırız?
        //Instance variable ların diger adı obje variable lardir
        //istance variable lara ojbe uzerinden ulasabılırız



        C03_ObjectVariables pers1= new C03_ObjectVariables();
        System.out.println(pers1.persIsmi);// isim girilmedi
        System.out.println(pers1.persYasi);// 0

        pers1.persIsmi="Suleymen";
        pers1.persYasi=35;
        pers1.persTelefonu="555.345654";

        System.out.println(pers1.persIsmi);// isim girilmedi
        System.out.println(pers1.persYasi);// 0

        C03_ObjectVariables pers2= new C03_ObjectVariables();
        pers2.persIsmi= "Latife";
        pers2.persYasi=32;
        pers2.persTelefonu="555.265626";

        System.out.println(pers1.persIsmi);//Suleyman
        System.out.println(pers2.persIsmi);//Latife

        C03_ObjectVariables pers3=new C03_ObjectVariables();
        pers3.persIsmi="fatih";
        pers3.persYasi=33;
        pers3.persTelefonu="111.5522";

        System.out.println(pers1.persYasi);//35
        System.out.println(pers2.persYasi);//32
        System.out.println(pers3.persYasi);//33


    }
}
