package LR8;

import java.io.*;

public class example11 {
    public static void main(String[] args) throws IOException {
        final var file1 = new File("/tmp/MyFile1.txt");
        final var file2 = new File("/tmp/MyFile2.txt");

        try (
                final var inputStream1 = new BufferedInputStream(new FileInputStream(file1));
                final var dataReader1 = new DataInputStream(inputStream1);
                final var inputStream2 = new BufferedInputStream(new FileInputStream(file2));
                final var dataReader2 = new DataInputStream(inputStream2);

                final var outputStream1 = new BufferedOutputStream(new FileOutputStream(file1));
                final var dataWriter1 = new DataOutputStream(outputStream1);
                final var outputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
                final var dataWriter2 = new DataOutputStream(outputStream2)
        ) {
            dataWriter1.writeUTF("Hello,\n");
            dataWriter1.writeUTF("world!\n");
            dataWriter1.writeDouble(48.4);
            dataWriter1.writeDouble(39.3);
            dataWriter1.writeDouble(-4.8);
            dataWriter1.writeDouble(8.9);
            dataWriter1.writeDouble(-23.06);
            dataWriter1.flush();

            System.out.println("Чтение:");
            for (var i = 0; i < 2; i++) {
                final var line = dataReader1.readUTF();
                System.out.print(line);
                dataWriter2.writeUTF(line);
            }

            for (var i = 0; i < 5; i++) {
                final var number = dataReader1.readDouble();
                System.out.println(number);
                dataWriter2.writeDouble(number);
            }
            dataWriter2.flush();

            System.out.println("\nЗапись:");

            for (var i = 0; i < 2; i++) {
                final var line = dataReader2.readUTF();
                if(i != 1){
                    continue;
                }
                System.out.print(line);
            }

            for (var i = 0; i < 5; i++) {
                final var number = dataReader2.readDouble();
                if(number < 0){
                    continue;
                }
                System.out.println(number);
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);

            throw e;
        }
    }
}