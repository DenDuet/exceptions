// import java.util.Scanner;

// public class Task3 {
//     // Задание 3

//     public static void main(String[] args) throws Exception {
//         try {
//             int a = 90;
//             int b = 3;
//             System.out.println(a / b);
//             printSum(23, 234);
//             newString();
//             int[] abc = { 1, 2 };
//             abc[3] = 9;
            
//         } catch (IllegalArgumentException ex) {
//             System.out.println("Строка не должна быть пустой!");
//         } catch (NullPointerException ex) {
//             System.out.println("Указатель не может указывать на null!");
//         } catch (IndexOutOfBoundsException ex) {
//             System.out.println("Массив выходит за пределы своего размера!");
//         } catch (Throwable ex) {
//             System.out.println("Что-то пошло не так...");
//         }
//     }

//     private static void newString() throws Exception {
//         Scanner str = new Scanner(System.in);
//         System.out.println("Введите строку: ");
//         String newLine = str.nextLine();
//         if (newLine.equals("")) {
//             str.close();
//             throw new IllegalArgumentException("Строка не должна быть пустой!");
//         }
//         str.close();
//     }

//     public static void printSum(Integer a, Integer b) throws Exception {
//          System.out.println(a + b);
// }
// }

import java.util.Scanner;

public class Task3 {
    // Задание 3

    public static void main(String[] args) throws Exception {
        // try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            newString();
            int[] abc = { 1, 2 };
            int index=3;
            if (index<abc.length) {
                abc[index] = 9;
            } else {
                System.out.println("Индекс ["+ index + "] за пределами массива! Длина массива: " + abc.length);
            }
            
        // } catch (IllegalArgumentException ex) {
        //     System.out.println("Строка не должна быть пустой!");
        // } catch (NullPointerException ex) {
        //     System.out.println("Указатель не может указывать на null!");
        // } catch (IndexOutOfBoundsException ex) {
        //     System.out.println("Массив выходит за пределы своего размера!");
        // } catch (RuntimeException ex) {
        //     System.out.println("Что-то пошло не так..." + ex);
        // }
    }

    private static void newString() {
        try(Scanner str = new Scanner(System.in)) {
        System.out.println("Введите строку: ");
        String newLine = str.nextLine();
        while (newLine.equals("")) {
            System.out.println("Строка не должна быть пустой!");
            newLine = str.nextLine();
        }
        }
    }

    public static void printSum(Integer a, Integer b) {
         System.out.println(a + b);
}
}
