package LR6;

public class example3 {
    public static void main(String[] args) {
        int[] Array = {10, 20, 30, 40, 50};

        System.out.print("Максимальное значение: ");
        MaxMinAverage.Maximum(Array);
        System.out.print("Минимальное значение: ");
        MaxMinAverage.Minimum(Array);
        System.out.print("Среднее значение: ");
        MaxMinAverage.Average(Array);
    }

    class MaxMinAverage {
        static void Maximum(int[] max) {
            int[] maximum = max;
            int maxNum = 0;
            for (int i = 0; i < maximum.length; i++) {
                if (maxNum < maximum[i]) {
                    maxNum = maximum[i];
                }
            }
            System.out.println(maxNum);

        }

        static void Minimum(int[] min) {
            int[] minimum = min;
            int minNum = 100;
            for (int i = 0; i < minimum.length; i++) {
                if (minNum > minimum[i]) {
                    minNum = minimum[i];
                }
            }
            System.out.println(minNum);

        }

        static void Average(int[] avrg) {
            int[] average = avrg;
            int avrgNum = 0;
            for (int i = 0; i < average.length; i++) {
                avrgNum += average[i];
            }
            avrgNum = avrgNum / average.length;
            System.out.println(avrgNum);
        }
    }
}