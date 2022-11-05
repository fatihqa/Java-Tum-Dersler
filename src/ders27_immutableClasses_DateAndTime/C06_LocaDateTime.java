package ders27_immutableClasses_DateAndTime;

import java.time.LocalDateTime;

public class C06_LocaDateTime {
    public static void main(String[] args) {

        LocalDateTime zaman= LocalDateTime.now();

        System.out.println(zaman);// 2022-10-29T19:30:29.985652200

        System.out.println(zaman.getDayOfMonth());// 29



    }
}
