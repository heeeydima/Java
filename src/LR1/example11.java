package LR1;

import java.util.Date;
import java.util.Scanner;

public class example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input what year were you born in: ");

        Scanner scanner = new Scanner(System.in);

        int yearOfBirth = scanner.nextInt();

        int yearsOld            = (new Date()).getYear() + 1900 - yearOfBirth;
        int lastDigit             = yearsOld % 10;
        int previousLastDigit = yearsOld / 10 % 10;

        if (previousLastDigit == 1) {
        }
        else {
            switch (lastDigit) {
                case 1:
                    break;
                case 2:
                case 3:
                case 4:
                default:

                    System.out.println("Name: " + name);
                    System.out.println("Age: " + yearsOld);
            }
        }

        scanner.close();

    }
}
