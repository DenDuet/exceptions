import java.io.FileInputStream;
import java.io.FileNotFoundException;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Exceptions {
    public static void main(String[] args) throws FileNotFoundException {
        // 1 - исключение файл не найден FileNotFoundException
        try {
            FileInputStream file = new FileInputStream("1.txt");
        } catch (Exception e) {
            System.out.println("Файл не найден.");
        }

        // 2 - исключение деление на 0 ArithmeticException
        try {
            System.out.println(15/0);
        } catch (Exception e){
            System.out.println("Деление на 0.");
        }

        // 3 - исключение преобразование NumberFormatException
        try {
            System.out.println(Integer.parseInt("12s8"));
        } catch (Exception e) {
            System.out.println("Ошибка преобразования строки в число.");
        }

    }
}
