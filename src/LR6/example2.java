package LR6;

public class example2 {
    public static void main(String[] args) {
        Number number = new Number();
        number.Show();
        number.Show();
        number.Show();
    }

    static class Number {
        private static int num;

        public static void Show() {
            System.out.println("Значение: " + num);
            num++;
        }
    }
}