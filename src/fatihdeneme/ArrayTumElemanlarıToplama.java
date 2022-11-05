package fatihdeneme;

public class ArrayTumElemanlarıToplama {
    public static void main(String[] args) {

        int[] arr1={3,5,7,8};//23
        int toplam=0;

        for (int i = 0; i <arr1.length ; i++) {

            toplam+=arr1[i];
        }
        System.out.println("Tek katlı elemanların toplamı : "+toplam);
    }
}
