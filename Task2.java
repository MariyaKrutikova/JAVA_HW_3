import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Пусть дан произвольный список целых чисел. Удалить из него чётные числа. */

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = getNewList();
        changeList(list);
    }
    
//  Метод, для задания списка целых чисел. Начальный размер списка задается пользователем.
    private static List <Integer> getNewList () {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер списка: ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int element = (int) (Math.random()*10);
            // System.out.println("Укажите целое число: ");
            // int element = scanner.nextInt();
            list.add(i, element);
        }
        System.out.println(list);
        scanner.close();
        return list;
    }


    private static List<Integer> changeList (List<Integer> list) {
        for (int i =0; i < list.size(); i++) {
            if ((Integer)list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        return list;
    }
}
