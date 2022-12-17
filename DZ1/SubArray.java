
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен разности элементов 
// двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class SubArray {
    public static void main(String[] args) {
        int[] array = {10, 1, 2, 5, 9};
        int[] array1 = {1, 4, 3, 4, 8};
        // int[] array1 = {0, 5, 6, 8};

        System.out.println("------------------");
        if (array.length!=array1.length) {
            System.out.println("Массивы не равны!");
        } else {
            int[] arrayFinal = subArray(array, array1);
            System.err.print("Массив: [");
      
            for (int i = 0; i < arrayFinal.length; i++) {
            System.out.print(arrayFinal[i]+", ");
                }
            System.err.println("]");
            }
    }

    private static int[] subArray(int[] array, int[] array1) {
        int[] arrayF = new int[array.length];
        for (int i = 0; i < arrayF.length; i++) {
            arrayF[i] = array[i] - array1[i];        
        }
        return arrayF;
    }
}
