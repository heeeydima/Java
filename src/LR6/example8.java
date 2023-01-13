package LR6;

public class example8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println("Среднее значение элементов массива: " + Average.SetAvg(array));
    }

    class Average {
        static double SetAvg(int arr[]) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            double result = (double) sum / arr.length;
            return result;
        }
    }
}