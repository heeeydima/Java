package LR1;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input lastname: ");
        String lastname = in.nextLine();

        System.out.println("Input firstname: ");
        String firstname = in.nextLine();

        System.out.println("Input patronymic: ");
        String patronymic = in.nextLine();

        System.out.println("Hello!");

        System.out.println("Last name: " + lastname);
        System.out.println("First name: " + firstname);
        System.out.println("Patronymic: " + patronymic);
        in.close();

    }
}
