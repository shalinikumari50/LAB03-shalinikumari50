package program3;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatureInFahrenheit = scanner.nextDouble();
        double temperatureInCelsius = (temperatureInFahrenheit - 32) / 1.8;



        scanner.close();
    }
}
