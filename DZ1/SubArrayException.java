
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен разности элементов 
// двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class SubArrayException {
    public static void main(String[] args) {
        int[] array = {10, 1, 2, 5, 9};
// Проверка 3
        int[] array1 = {1, 4, 0, 4, 8};
        // int[] array1 = {2, 5, 6, 8, 11};

        try {
            System.out.println("------------------");
            if (array.length!=array1.length) {
                System.out.println("Массивы не равны!");
            } else {
                int[] arrayFinal = divArray(array, array1);
                System.err.print("Массив: [");

// Проверка 2      
                // for (int i = 0; i <= arrayFinal.length; i++) {
                for (int i = 0; i < arrayFinal.length; i++) {
                    System.out.print(arrayFinal[i]+", ");
                    }
                System.err.println("]");
                }
        } catch (RuntimeException e) {
            System.out.println("Вот такая ошибка: "+e.getClass().getName());
        }
    }

    private static int[] divArray(int[] array, int[] array1) throws RuntimeException {
        int[] arrayF = new int[array.length];
// Проверка 1
       for (int i = 0; i < arrayF.length; i++) {
        // for (int i = 0; i <= arrayF.length; i++) {
            if (array1[i]==0) {System.out.println("Деление на 0!"); }
            arrayF[i] = array[i] / array1[i];   
        }
        return arrayF;
    }
}
