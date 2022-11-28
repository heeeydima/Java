package LR1;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day of the week: ");
        String dayoftheweek = in.nextLine();

        System.out.println("Input date: ");
        String date = in.nextLine();

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Day of the week: " + dayoftheweek);
        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        in.close();

    }
}
