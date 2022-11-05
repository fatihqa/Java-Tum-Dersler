package ders26_passByvalue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C06_ImmutableClasses {
    public static void main(String[] args) {

        String str="Java guzeldir";
        System.out.println(str.toUpperCase());//JAVA GUZELDİR

        System.out.println(str);//Java guzeldir

        str.toUpperCase();
        System.out.println(str);//

        //String immutable old. icin method ile yapılan degisiklikler String'i kalıcı degistirmez

        List<String>harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("B");

        harfler.remove(0);
        System.out.println(harfler);

        // List ve array mutable old.icin method ile yapilan degisikler kalıcı olur.
    }
}
