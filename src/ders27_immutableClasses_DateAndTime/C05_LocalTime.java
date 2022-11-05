package ders27_immutableClasses_DateAndTime;

import java.time.LocalTime;

public class C05_LocalTime {
    public static void main(String[] args) {

        LocalTime saat= LocalTime.now();
        System.out.println(saat); //19:21:48.809594900

        LocalTime saat2 = LocalTime.of(15,10,20);

        System.out.println(saat.compareTo(saat2));
        saat2.withNano(4656);


    }
}
