import java.util.Scanner;

public class RecursiveNumberPrinter {


    public static void printNumbersInRange(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.print(start + " ");
        printNumbersInRange(start + 1, end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите начальное число:");
        int start = scanner.nextInt();
        System.out.println("Введите конечное число:");
        int end = scanner.nextInt();
        scanner.close();


        System.out.println("Числа в диапазоне от " + start + " до " + end + ":");
        printNumbersInRange(start, end);
    }
}

