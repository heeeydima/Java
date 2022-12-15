package LR4;

public class example2 {
    public static void main(String[] args) {
        int height = 15;
        int z = 0;
        for (int i = 1; i <= height; i++) {
            System.out.print(" ");
            for (int j = 0; j <= z; j++) {
                System.out.print("0");
            }
            z = z + 1;
            System.out.println();
        }
    }
}
