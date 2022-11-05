package ders08_ternary_switch;

public class C02_Ternary {
    public static void main(String[] args) {
        String str1= "Ali";
        String str2= "ALI";

        // verilen iki metin birbiri ile ayni ise "metinler ayni"
        // farkli ise "metinler farkli" yazdirin

        if (str1.equals(str2)){
            System.out.println("metinler ayni");
        }else{
            System.out.println("metinler farkli");
        }

                                //esit     //ise              //degilse
        System.out.println(str1.equals(str2) ? "Metinler ayni" : "Metinler farkli");







    }
}
