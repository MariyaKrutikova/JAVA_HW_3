import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int[] arrayToSort = getArray();
        int [] sortArray = getSortArray(arrayToSort);
        System.out.println(Arrays.toString(sortArray));
    }

    private static int[] getArray () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размерность массива: ");
        int dimention = scanner.nextInt();
        int[] newArray = new int[dimention];
        for (int i = 0; i < dimention; i++) {
            int element  = (int) (Math.random()*10);
            newArray[i] = element;
        }
        System.out.println(Arrays.toString(newArray));
        scanner.close();
        return newArray;
    }
    
   
    //  Метод сортировки заданного массива
    private static int [] getSortArray (int[] array) {
        if (array == null) return null;
        if (array.length < 2) return array;
        
        int [] array1 = Arrays.copyOfRange(array, 0, array.length/2); /*Задали первый массив, длинной ~ в половину от начального */
        int [] array2 = Arrays.copyOfRange(array, array.length/2, array.length); /*Задали второй массив, длиной ~ в половину от начального */
        // System.out.println(Arrays.toString(array1));       
        // System.out.println(Arrays.toString(array2));
        array1 = getSortArray(array1); /*Рекурсивно вызываем функции*/
        array2 = getSortArray(array2);

        return margeArrays(array1, array2);
    }


        // Метод слияния массивов.
    private static int[] margeArrays (int [] array1, int [] array2) {
    int [] newSortArray = new int[array1.length + array2.length]; /*Задали пустой массив, в который будем записывать отсортированые элементы*/
    int index1 = 0; /* Задаем переменную для отслеживания индекса элемента в array1*/
    int index2 = 0; /* Задаем переменную для отслеживания индекса элемента в array1*/
     
        /*Осуществляем слияние массивов*/
    for (int index = 0; index < array1.length + array2.length; index++) {

        if (index1 > array1.length-1) { /* Проверяем не закончился ли первый массив*/
            newSortArray[index] = array2[index2];
            index2++; 
        } 
        else if (index2 > array2.length-1) { /* Проверяем не закончился ли второй массив*/
            newSortArray[index] = array1[index1];
            index1++;
        } 
        else if (array1[index1] < array2[index2]) {
            newSortArray[index] = array1[index1];
            index1++;
        } 
        else {
            newSortArray[index] = array2[index2];
            index2++;
        }
    }
    return newSortArray;
    }    
}

   
