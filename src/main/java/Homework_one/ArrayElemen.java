package Homework_one;

import java.util.Arrays;

public class ArrayElemen {
    public static void main(String[] args) {

        int[] arr = new int[]{25, 14, 56, 15, 47};
        int index = 2;
        int newValue = 5 ;
        for (int i = arr.length-1; i >index; i--) {
            arr[i] = arr[i - 1];
        }
            arr[index] = newValue;

            System.out.println(Arrays.toString(arr));



    }

}
