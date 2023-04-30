import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.*/


public class Task3 {
    public static void main(String[] args) {
        List <Integer> list = getNewList();
        getMinMaxAverage(list);
    }

// Метод, задающий массив.
    private static List <Integer> getNewList () {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размерность массива: ");
        int dimention = scanner.nextInt();
        for (int i = 0; i < dimention; i++) {
            int element = (int)(Math.random()*10);
            list.add(i, element);
        }
        System.out.printf("Начальный список: %s \n", list);
        scanner.close();
        return list;
    }

    private static void getMinMaxAverage (List<Integer> list) {
        int minValue = list.get(0);
        int maxValue = list.get(0);
        double sumValue = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxValue) maxValue = list.get(i);
            else if (list.get(i) < minValue) minValue = list.get(i);

            sumValue = sumValue + list.get(i);
         }
         System.out.printf("Минимальное значение в списке: %s \n", minValue);
         System.out.printf("Максимальное значение в списке: %s \n", maxValue);
         System.out.printf("Среднее арифметическое: %.5s \n", sumValue/list.size());         
    }
}
