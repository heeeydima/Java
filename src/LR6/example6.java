package LR6;

public class example6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println("Второй аргумент меньше длины массива");
        Array array = new Array();
        for (int i = 0; i < array.SetArr(arr1, 6).length; i++) {
            System.out.println("arr[" + i + "] = " + array.SetArr(arr1, 6)[i]);
        }
        System.out.println("Второй аргумент больше длины массива");
        Array.SetArr(arr1, 32);
        Array.view();
    }

    static class Array {
        private static int arr2[];

        static int[] SetArr(int arr1[], int num) {

            if (num > arr1.length) {
                num = arr1.length;
            }
            arr2 = new int[num];
            for (int i = 0; i < num; i++) {
                arr2[i] = arr1[i];
            }
            return arr2;
        }

        static void view() {
            for (int i = 0; i < Array.arr2.length; i++) {
                System.out.println("arr[" + i + "] = " + arr2[i]);
            }
        }
    }
}