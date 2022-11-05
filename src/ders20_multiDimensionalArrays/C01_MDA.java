package ders20_multiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {

        int [][] arr= {{4,3,1}, {1,2},{5,6,7},{},{3,6,8,0}};

        System.out.println(arr.length);//5

        System.out.println(arr[2].length);//[5,6,7] ==>lenght 3

        System.out.println(arr[1]);// [1,2]==> direk yazdirilmaz java referansı yazdirir

        System.out.println(Arrays.toString(arr[1]));// [1,2]

        // tum class yazdırmak için

        System.out.println(Arrays.deepToString(arr));// [[4, 3, 1], [1, 2], [5, 6, 7], [], [3, 6, 8, 0]]

        System.out.println(arr[3][0]);/// .ArrayIndexOutOfBoundsException

    }
}
