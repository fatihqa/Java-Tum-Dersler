package ders13_nestedForLoop_Metodolusturma;

import java.sql.SQLOutput;

public class C07_MethodOlusturma {

    public static void main(String[] args) {

        String str = "Java muhtesemdir";
        // metni buyuk harfe cevirinn

        String buyukStr=str.toUpperCase();

        System.out.println(str);//Java muhtesemdir

        System.out.println(buyukStr);// JAVA MUHTESEMDİR

        //METNİN BUYUK HARLERE CEVRİLMİS HAL s İCERİR Mİ

        System.out.println(buyukStr.contains("S"));//ture

    }
}
