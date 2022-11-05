package ders10_stringManipulation;

public class C10_isEmpty {
    public static void main(String[] args) {

        String str = "" ;

        System.out.println(str.isEmpty());// true

        str="   " ;

        System.out.println(str.isEmpty()); // false // içinde karakter var
        System.out.println(str.isBlank()); // ture

        str="x";  // "x" degerini verince false oluyor

        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // false


    }


}