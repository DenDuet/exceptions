public class Task2 {
    // Задание 2
    // try {
    //    int d = 0;
    //    double catchedRes1 = intArray[8] / d;   - ! не объявлен массив intArray, деление на 0 (d) !
    //    System.out.println("catchedRes1 = " + catchedRes1);
    // } catch (ArithmeticException e) {
    //     System.out.println("Catching exception: " + e);
    // }
    public static void main(String[] args) {
            
        try {
           int d = 0;
           int[] intArray = new int [7];
           double catchedRes1 = intArray[8] / d; // оставил, чтобы посмотреть как поймается ошибка
           System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index exception: " + e);
        } 
    }


}
