import java.util.Scanner;


public class solution {

    public static void printSubsets(int[] arr, int startIndex, int[] output) {
        if (startIndex == arr.length) {
            for (int i : output) {
                System.out.print(i + "\t");
            }
            System.out.println();
            return;
        }
        int[] newOutput = new int[output.length + 1];
        int i = 0;
        for (; i < output.length; i++) {
            newOutput[i] = output[i];
        }
        newOutput[i] = arr[startIndex];
        /*when first element is contributing*/
        printSubsets(arr, startIndex + 1, newOutput);
        /*when first element is not contributing*/
        printSubsets(arr, startIndex + 1, output);

    }

    public static void printSubsets(int[] arr) {
        int[] output = new int[0];
        printSubsets(arr, 0, output);
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
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
        int[] arr = takingInput();
        printSubsets(arr);
    }
}
