package LR6;

import java.util.Random;

public class example4 {
    public static void main(String[] args) {
        Random r = new Random();
        Factorial f = new Factorial();
        int n = r.nextInt(10);
        System.out.println("Число: " + n);
        int factorial1 = f.doublefactorial(n);
        int factorial2 = f.doublefact(n);
        System.out.println("Двойной факториал числа без рекурсии: " + factorial1);
        System.out.println("Двойной факториал числа с рекурсией: " + factorial2);
    }

    static class Factorial {
        public static int doublefact(int num) {
            if (num == 0 || num == 1)
                return 1;

            return num * doublefactorial(num - 2);
        }

        public static int doublefactorial(int num) {
            int result = 1;
            for (int i = num; i >= 0; i = i - 2) {
                if (i == 0 || i == 1)
                    return result;
                else
                    result *= i;
            }
            return result;
        }
    }
}