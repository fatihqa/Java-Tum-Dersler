package ders13_nestedForLoop_Metodolusturma;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        //1-4 arasındakı sayılar ıcın carpım tablosu olusturalım

        // dıs dongu satırları kontrol eder

        for (int i = 1; i <=4 ; i++) {
            // ic dongu her satrıda olan degerlerı kontrol eder

            for (int j = 1; j <=4 ; j++) {

                System.out.print(i*j + " ");
            }
            //in dongu bittignide javayıalt satıra indirmeliyiz
            System.out.println("");
        }








    }
}
