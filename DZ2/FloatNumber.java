import java.util.Scanner;

public class FloatNumber {
    public static void main(String[] args) {
        Float number=(float) 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число (float): ");
        while (true) {
            if (!scan.hasNextFloat()) {
                System.out.println("Введите число (float): ");
                scan.next();
            } else {
                number = scan.nextFloat();
                System.out.println("Вы ввели число: " + number);
                break;
            }
            
        }
        scan.close();
    }
}
