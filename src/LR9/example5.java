package LR9;

public class example5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        }
        catch (NullPointerException e) { System.out.println("1 "+e ); }
        System.out.println("2");
    }
}