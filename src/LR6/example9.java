package LR6;

public class example9 {
    public static void main(String[] args) {
        char[] array = {'п', 'р', 'и', 'в', 'e', 'т', '!'};
        ChangeArr.Change(array);
        ChangeArr.view();
    }

    class ChangeArr {
        static char[] arr1;

        static char[] Change(char[] arr2) {
            arr1 = new char[arr2.length];

            char temp;
            int c = arr2.length - 1;
            for (int i = 0; i < arr2.length; i++) {
                temp = arr2[i];
                arr1[i] = arr2[c - i];
                arr1[c - i] = temp;
            }
            return arr1;
        }

        static void view() {
            for (int i = 0; i < arr1.length; i++) {
                System.out.println("arr [" + i + "] = " + arr1[i]);
            }
        }
    }
}