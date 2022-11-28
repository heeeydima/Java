package LR1;

import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input firstname: ");
        String firstname = in.nextLine();

        System.out.println("Input age: ");
        String age = in.nextLine();

        System.out.println("First name: " + firstname);
        System.out.println("Age: " + age);
        in.close();

    }
}
