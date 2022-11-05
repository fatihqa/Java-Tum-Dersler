package fatihdeneme;

public class ArraykonuTekrar {
    public static void main(String[] args) {

        int[] arr1={2,4,6,8,10};
        // array bir elementine ulasmak ve update etmek istersek

        System.out.println(arr1[2]);// 6

        arr1[3]=20;
        System.out.println(arr1[3]);//20


        System.out.println(arr1.length);//5
        //son elementi yazdırın

        System.out.println(arr1[arr1.length-1]);//10
        // aarry in tum ekementlerini yazdırın

        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+ " ");
            
        }

        // arry in uzunlugu sonradan degıstırelemez
        // eger array de olmayan bir index e atama yapmak isterseniz
        //ArrayIndexOutOfBoundsException hatası verir
        // run time erroy yani jaa calıstırınca anlar
      //  arr1[5]=35;
    }
}
