package ders27_immutableClasses_DateAndTime;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;

public class C04_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.minusDays(100));//2022-07-21 100 gün onceki tarih
        System.out.println(tarih.minusWeeks(5).minusDays(3));  //2022-09-21 5 hafta 3 gün once

        System.out.println(tarih.plusMonths(5).minusWeeks(2).minusDays(3));//2023-03-12

        System.out.println(tarih.getMonthValue());//10
        System.out.println(tarih.getMonth()); //OCTOBER
        System.out.println(tarih.getDayOfWeek());// SATURDAY
        System.out.println(tarih.getDayOfYear());//  302    yilin günü

        System.out.println(tarih.isLeapYear());// false

        System.out.println(tarih.withYear(1990).isLeapYear());// false  1990 yili artık yilmi
        System.out.println(tarih.withYear(2020).withMonth(10).withDayOfMonth(13)); //2020-10-13

        System.out.println(tarih.lengthOfYear()); //365
        System.out.println(tarih.withYear(2020).lengthOfYear()); // 366

        System.out.println(tarih.withYear(1990).withMonth(1).withDayOfMonth(26).getDayOfWeek());//FRIDAY

        LocalDate date= LocalDate.of(1990,1,26);
        LocalDate date2= LocalDate.of(2010,2,3);

        System.out.println(date.isBefore(date)); // false
        System.out.println(date.isAfter(date2));// false


    }
}
