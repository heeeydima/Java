package LR6;

public class example7 {
    public static void main(String[] args) {
        char[] array = {'п', 'р', 'и', 'в', 'е', 'т'};
        Array.SetArr(array);
        Array.view();
    }

    public class Array {
        static int[] arr;

        static int[] SetArr(char charr[]) {
            arr = new int[charr.length];
            for (int i = 0; i < charr.length; i++) {
                arr[i] = (int) charr[i];
            }
            return arr;
        }

        static void view() {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }
    }
}