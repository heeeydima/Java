package TIMUS;

import java.io.Console;
import java.util.Scanner;
import java.util.StringJoiner;

public class task_1209 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in );
        long num = sc.nextLong();
        StringJoiner result = new StringJoiner(" ");

        while (num > 0) {
            long x = sc.nextLong();
            double s = Math.sqrt(8*x-7);
            if (s % 1 == 0)
                result.add("1");
            else
                result.add("0");
            num--;
        }
        sc.close();

        System.out.println(result);
    }
}