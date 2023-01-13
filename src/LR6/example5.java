package LR6;

public class example5 {
    public static void main(String[] args) {
        Sum s = new Sum();
        int summa1 = s.sum(3);
        int summa2 = s.sumrekurs(3);
        System.out.println("Сумма с рекурсией: " + summa1);
        System.out.println("Сумма без рекурсии: " + summa2);
    }

    static class Sum {
        static int sum(int num) {
            int result = 0;
            for (int i = 1; i <= num; i++)
                result += (int) (Math.pow(i, 2));
            return result;
        }

        static int sumrekurs(int num) {
            if (num <= 1)
                return num;
            else
                return sumrekurs(num - 1) + num * num;
        }
    }
}