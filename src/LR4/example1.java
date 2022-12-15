package LR4;

public class example1 {
    public static void main(String[] args) {
        int rows = 11;
        int columns = 23;
        int z;
        for (int i = 1 ; i <= rows; i++){
            System.out.print(" ");
            z = 0;
            for (int j = 1; j <=columns; j++){
                System.out.print("0");
                z = z + 1;
            }
            System.out.println();
        }
    }
}
