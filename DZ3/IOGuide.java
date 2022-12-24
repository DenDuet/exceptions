import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class IOGuide {

    public static void readFile(String fileName) {
        Charset charset = StandardCharsets.UTF_8;

        try (FileReader file = new FileReader(fileName, charset);
             Scanner scan = new Scanner(file)) {
            int i = 0;
            ArrayList<String> readedString = new ArrayList<>();
            while (scan.hasNextLine()) {
                readedString.add(scan.nextLine());
                i++;
            }
            System.out.println("Прочитанные данные: ");
            for (i = 0; i < readedString.size(); i++) {
                System.out.println("Запись " + i + ": " + readedString.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");

        } catch (IOException e) {
            System.out.println("Ошибка открытия файла на чтение.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Превышен индекс массива при чтении из файла.");
        }
    }

    public static void writeFile(String fileName, String writedString) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(writedString);
//            writer.append('\n');
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
