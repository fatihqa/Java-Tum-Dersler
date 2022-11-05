package ders11_stringManipulation;

public class C04_replaceAll {
    public static void main(String[] args) {
        //kullancını girdigi metinde harf dısınad kalan tum karakterlerı temızleyenbır kod yazın
        //Not: space silinmemeli

        String input="Ja4+va cok 1*guzel";


        input=input.replaceAll("\\d","");//Ja+va cok *guzel
        input=input.replace(" ","5");  //Ja+va5cok5*guzel
        input=input.replaceAll("\\W",""); //Java5cok5guzel
        input=input.replace("5"," ");// Java cok guzel


        System.out.println(input);








    }


}
