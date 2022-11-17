package fatihdeneme.Array;

public class d_ArithmeticException_ extends Throwable {
    // Verilen iki tamsayiyi birbirine bolup
    // sonucun tamsayi kismini yazdirin
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=2;


        try {
            System.out.println(sayi1/sayi2);
            System.out.println("Sayi sifira bolunmez");
        } catch (ArithmeticException e) {
            System.out.println("Bu sayi sifira bolunmez");

        }
    }


}
