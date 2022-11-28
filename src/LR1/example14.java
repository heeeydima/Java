package LR1;

import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flagOrder = sc.nextInt() < 0 ? -1 : 1;
        int counter = 1;
        while(sc.hasNextInt()) {
            flagOrder += (sc.nextInt() - flagOrder) < 0 ? -1 : 1;
            counter++;
        }
        if (counter == 1)
            System.out.println("The order is not defined!");
        else if (counter == flagOrder)
            System.out.println("Grow");
        else System.out.println("Decreases");
    }
}


