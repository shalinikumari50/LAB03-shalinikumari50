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
        int monthNumber = month;
        String[] Array = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (month > 2) {
            month -= 2;
        } else {
            month += 10;
        }
        int century = year / 100;
        year %= 100;

        int f = date + ((13 * month - 1) / 5) + year + (year / 4) + (century / 4) - 2 * century;
        int weekDay = f % 7;
        if (weekDay < 0) {
            weekDay += 7;
        }
        String day = "";

        switch (weekDay) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
        }
        System.out.println(date + " " + Array[monthNumber - 1] + " " + century + year + " was a " + day + "!");


        scanner.close();
    }
}
