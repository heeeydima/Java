package LR6;

public class example10 {
    public static void main(String[] args) {
        MaxMin m = new MaxMin();
        m.SetMaxmin(1, 56, 47, 23, 48, 9, 39);
        m.view();
    }

    static class MaxMin {
        static int[] maxmin;

        static int[] SetMaxmin(int... arr) {
            int max = arr[0];
            int min = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                } else if (arr[i] < min) {
                    min = arr[i];
                }
            }
            maxmin = new int[]{max, min};
            return maxmin;
        }

        static void view() {
            System.out.println("arr - max: " + maxmin[0]);
            System.out.println("arr - min: " + maxmin[1]);
        }
    }
}