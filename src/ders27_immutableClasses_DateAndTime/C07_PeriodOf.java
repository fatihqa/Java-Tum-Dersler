package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {

        // dogumunuzdan bugune ne kadar zaman gecti ?

        LocalDate bugun= LocalDate.now();
        LocalDate dogumgunu= LocalDate.of(1990,01,26);

        Period gecensure= Period.between(dogumgunu,bugun);
        System.out.println(gecensure); //P32Y9M3D

        System.out.println(gecensure.getYears());//32

    }
}
