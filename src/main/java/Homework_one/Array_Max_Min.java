package Homework_one;

public class Array_Max_Min {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j > arr.length; j++) {
                min = arr[j];
                arr[i] = arr[j];
                arr[j] = min;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <arr.length; j++) {
                max = arr[j];
                arr[i] = arr[j];
                arr[j] = max;
            }
        }
        System.out.println("Minimum is: " + min);
        System.out.println("Maximum is: " + max);
    }


}
