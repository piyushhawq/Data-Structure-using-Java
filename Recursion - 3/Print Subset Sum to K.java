import java.util.Scanner;

public class solution {

    public static void printSubsetsSumTok(int[] arr, int startIndex, int[] output, int sumToK) {
        if (startIndex == arr.length) {
            if (sumToK == 0) {
                for (int i : output) {
                    System.out.print(i + "\t");
                }
                System.out.println();
                return;
            } else {
                return;
            }
        }
        int[] newOutput = new int[output.length + 1];
        int i = 0;
        for (; i < output.length; i++) {
            newOutput[i] = output[i];
        }
        newOutput[i] = arr[startIndex];
        printSubsetsSumTok(arr, startIndex + 1, output, sumToK);
        printSubsetsSumTok(arr, startIndex + 1, newOutput, sumToK - arr[startIndex]);
    }

    public static void printSubsetsSumTok(int[] arr, int sumToK) {
        int[] output = new int[0];
        printSubsetsSumTok(arr, 0, output, sumToK);
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
        printSubsetsSumTok(arr, key);
    }
}
