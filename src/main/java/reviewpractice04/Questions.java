package reviewpractice04;

import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        /* 9) Type a program like; given an array whose length is 3, return an array with the elements "rotated left"
        For example; if the array is [1, 2, 3] output will be [2, 3, 1].
        her numara birbirinin yerine geciyor

*/
        int arr[] = {1, 2, 3};
        int brr[] = new int[arr.length];

        brr[arr.length - 1] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            brr[i - 1] = arr[i];

        }
        System.out.println(Arrays.toString(brr));


        // Find the sum of all elements in the multidimensional array { {1,2,3}, {4,5,6} }

        int crr[][] = {{1, 2, 3}, {4, 5, 6}};

        int sum1 = 0;

        for (int[] m : crr) {

            for (int u : m) {

                sum1 = sum1 + u;
            }
        }
        System.out.println(sum1);

        // Find the product of the last elements in the array elements of the given multi dimensional array { {1,2,3}, {4,5}, {6} }

        int drr[][] = {{1, 2, 3}, {4, 5}, {6}};

        int product = 1;
        for (int[] w : drr) {

            product = product * w[w.length - 1];

        }
        System.out.println(product);

        // 10) / 2) Find the smallest positive element and greatest negative element in an integer array

        //Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

        int frr[] = {-12, 18, -5, 23, -2};

        Arrays.sort(frr);
        System.out.println(Arrays.toString(frr)); // [-12, -5, -2, 18, 23]

        for (int i = 0; i < frr.length; i++) {

            if (frr[i] < 0 && frr[i + 1] > 0) {

                System.out.println("minPositive" + frr[i + 1]);
                System.out.println("maxNegative" + frr[i]);

                // Find the sum of the elements whose indexes are same in the given two multi dimensional arrays
                // arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }

                int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};


                int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};


                int sum = 0;


                for (int k = 0; i < arr1.length; k++) {

                    int minLength = Math.min(arr1[k].length, arr2[k].length);

                    for (int j = 0; j < minLength; j++) {

                        sum += arr1[k][j] + arr2[k][j];

                    }

                }

                System.out.println(sum);


            }

        }
    }
}

