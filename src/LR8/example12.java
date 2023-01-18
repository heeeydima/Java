package LR8;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class example12 {
    public static void main(String[] args) throws IOException {
        final var file1 = new File("/tmp/text1.txt");
        final var file2 = new File("/tmp/text2.txt");
        try (
                final var inputStream = new FileInputStream(file1);
                final var dataReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                final var outputStream = new BufferedOutputStream(new FileOutputStream(file2));
                final var dataWriter = new PrintWriter(outputStream);
                final var resultInputStream = new BufferedInputStream(new FileInputStream(file2));
                final var resultReader = new DataInputStream(resultInputStream)
        ) {

            var vowels = "аеёиоуыэюя";

            for (var i = 1; ; i++) {
                dataWriter.print("\nСтрока:" + i + "\n");
                var line = dataReader.readLine();

                if (line == null) {
                    break;
                }
                if (line.length() < 1) {
                    continue;
                }

                final var words = line.split("[^\\p{L}]+");
                var count = 0;
                for (var word : words) {
                    final var firstChar = word.substring(0, 1).toLowerCase();
                    if (vowels.contains(firstChar)) {
                        continue;
                    }
                    else count++;

                    dataWriter.println(word);
                }
                dataWriter.print("Количество слов: " + count + "\n");

            }
            dataWriter.flush();

            System.out.println(new String(resultReader.readAllBytes()));

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);

            throw e;
        }
    }
}