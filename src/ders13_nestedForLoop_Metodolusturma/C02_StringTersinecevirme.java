package ders13_nestedForLoop_Metodolusturma;

public class C02_StringTersinecevirme {
    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String input= "Java her gecen gun guzellesıyor";
        String tersInput ="";

        for (int i = input.length()-1; i >=0 ; i--) {

            tersInput+=input.substring(i,i+1); // royısellezug nug neceg reh avaJ


        }
        System.out.println("Ters hali :"+tersInput);




    }
}
