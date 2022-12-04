package LR2;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int d = sc.nextInt();
        if (d % 3 == 0) {
            System.out.println("Делится");
        } else
            System.out.println("Не делится");
    }
}
