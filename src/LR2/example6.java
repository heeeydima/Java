package LR2;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int num = in.nextInt();

        if (num<0)
        {
            num = num * -1;
        }

        char[] array;
        array = String.valueOf(num).toCharArray();
        if (array.length>3)
        {
            int arrayNum = array.length - 4;
            System.out.println(array[arrayNum] + ": столько тысяч в этом числе");
        }
        else
        {
            System.out.println("Число меньше тысячи");
        }
    }
}
