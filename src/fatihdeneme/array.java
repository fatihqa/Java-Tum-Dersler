package fatihdeneme;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {


        String [] arr= {"Ali", "Ulus","Nesrin"};
        // bu array tum elemenlerini aralarıda bır bosluk bırakarak yazdıralım

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
            // bu array i array olarak yazdıralım

            System.out.println(arr);
            // array i array olarka yazdıralım

            System.out.println(Arrays.toString(arr));//[Ali, Ulus, Nesrin]

        }
    }
}
