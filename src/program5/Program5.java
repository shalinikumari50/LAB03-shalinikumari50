package program5;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("date: ");
        int date = scanner.nextInt();
        System.out.print("month: ");
        int month = scanner.nextInt();
        System.out.print("year: ");
        int year = scanner.nextInt();

        scanner.close();
    }
}
