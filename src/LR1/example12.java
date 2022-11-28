package LR1;

import java.util.Date;
import java.util.Scanner;

public class example12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yearOfBirth = scanner.nextInt();

        int yearsOld            = (new Date()).getYear() + 1900 - yearOfBirth;
        int lastDigit             = yearsOld % 10;
        int previousLastDigit = yearsOld / 10 % 10;

        if (previousLastDigit == 1) {
            System.out.print(yearsOld + " лет");
        }
        else {
            switch (lastDigit) {
                case 1:
                    System.out.print(yearsOld + " год");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.print(yearsOld + " года");
                    break;
                default:
                    System.out.print(yearsOld + " лет");
            }
        }

        scanner.close();

    }
}