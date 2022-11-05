package ders26_passByvalue_ImmutableClasses;

public class C07_ImmutableString {
    public static void main(String[] args) {

        String str= "Java candir";
        str=str.toUpperCase();
        System.out.println(str);//JAVA CANDİR

        /*
        Immutable class'larda olusturulan bir objenin degeri degistirilemez
        Eger atama yaparsak java degerini degistirmez bunun yerine yeni bir obje olusturur.
        ve bu yeni obje ye yeni atadıgımız degeri atar.
        Eski obje bosa cıkar garbage(copcü) collector tarafından silinmeyi bekler
         */
    }
}
