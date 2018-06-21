import java.util.Scanner;

public class HomeWork_14_4 {

	public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[readLengthFromConsole(scan)];
        enterArrayFromConsole(arr);
        int[] arrZero = new int[countZero(arr)];
        createArrZero(countZero(arr), arr, arrZero);
        printArrZero(arrZero);

    }

    public static int readLengthFromConsole(Scanner scan) {
        int n = 0;
        System.out.print("Enter the length of Array, n: ");
        if (scan.hasNextInt()) {
            n = scan.nextInt();
        }
        return n;      
    }

    public static void enterArrayFromConsole(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a(" + (i+1) + ")=");
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static int countZero(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (0 == arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static void createArrZero(int countZero, int[] arr, int[] arrZero) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (0 == arr[i]) {
                arrZero[j] = i+1;
                j++;
            }
        }
    }

    public static void printArrZero (int[] arrZero) {
        System.out.println("New array:");
        for (int i = 0; i < arrZero.length; i++) {
            System.out.print(arrZero[i] + " ");
        }
    }
}