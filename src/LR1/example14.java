package LR1;

import java.math.BigInteger;
import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput < Math.sqrt(Integer.MAX_VALUE))
            System.out.println(userInput * userInput);
        else {
            BigInteger bi = new BigInteger(String.valueOf(userInput));
            System.out.println(bi.multiply(bi));
        }
    }
}


