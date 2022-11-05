package fatihdeneme.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraylistKullaniciyaListeOlusturma {
    public static void main(String[] args) {

        System.out.println(ListeOlurstır());
    }

    public static <Liste> List<String> ListeOlurstır() {

        List<String> isimler = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String girilenİsim = "";
        while (!girilenİsim.equalsIgnoreCase("q")) {


            System.out.println("lutfen listeye eklemek icn isim giriniz" +
                    "n\bitirmek için q'ya basın.");
            girilenİsim = scan.nextLine();

            if (!girilenİsim.equalsIgnoreCase("q")) {
                isimler.add(girilenİsim);
            }


        }
        return isimler;
    }
}