package LR6;

public class example1 {
    public static void main(String[] args) {
        Strings c = new Strings();
        c.Set('Д');
        c.Set("Всем привет!");

        char[] Array1 = {'А'};
        char[] Array2 = {'П', 'и', 'в', 'е', 'т'};

        c.Set(Array1);
        c.Set(Array2);
    }

    static class Strings {
        private char s;
        private String str;

        public void Set(char symbol) {
            s = symbol;
            System.out.println("Метод c символьным аргументом: " + s);
        }

        public void Set(String string) {
            str = string;
            System.out.println("Метод c текстовым аргументом: " + str);
        }

        public void Set(char[] Array) {
            if (Array.length == 1) {
                s = Array[0];
                System.out.println("\nМетод с одним элементом массива: " + s);
            } else {
                str = new String(Array);
                System.out.println("Метод с несколькими элементами массива: " + str);
            }
        }
    }
}