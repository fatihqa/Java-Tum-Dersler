package fatihdeneme;

public class Multidimensional_ciftsayi {
    public static void main(String[] args) {

        // verilen 2 katli bir integer array deki çift sayı adedini bulan kod yazınız

        int[][] arr = {{4, 6}, {3, 5, 8}, {1, 0, 4}};

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0) {


                    sayac++;

                }

            }

        }
        System.out.println("Araydeki cift sayi adedi : " + sayac);
    }
    }
