import java.util.Scanner;

public class solution {

    public static int[][] subsetsSumK(int[] arr, int startIndex, int sumToK) {
        if (startIndex == arr.length) {
            if (sumToK == 0) {
                return new int[1][0];
            } else {
                return new int[0][0];
            }
        }
       int[][] smallOutput1 = subsetsSumK(arr, startIndex + 1, sumToK);
        int[][] smallOutput2 = subsetsSumK(arr, startIndex + 1, sumToK - arr[startIndex]);
        int[][] output = new int[smallOutput1.length + smallOutput2.length][];

        int index = 0;
        for (int i = 0; i < smallOutput1.length; i++) {
            output[index++] = smallOutput1[i];
        }

        for (int i = 0; i < smallOutput2.length; i++) {
            output[index] = new int[smallOutput2[i].length + 1];
            output[index][0] = arr[startIndex];
            for (int j = 0; j < smallOutput2[i].length; j++) {
                output[index][j + 1] = smallOutput2[i][j];
            }
            index++;
        }
        return output;
    }

    public static int[][] subsetsSumK(int[] arr, int sumToK) {
        return subsetsSumK(arr, 0, sumToK);
    }

    public static void displayArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] takingInput() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = takingInput();
        int key = scan.nextInt();
        int[][] result = subsetsSumK(arr, key);
        displayArray(result);
    }
}
