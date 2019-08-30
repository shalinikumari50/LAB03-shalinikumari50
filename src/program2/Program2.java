package program2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceInDecimal = scanner.nextDouble();
        priceInDecimal *= 100;
        int paise = (int) priceInDecimal % 100;
        priceInDecimal /= 100;
        int rupees = (int) priceInDecimal;





        scanner.close();
    }

}
