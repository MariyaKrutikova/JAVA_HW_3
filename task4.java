import java.util.ArrayList;
import java.util.List;

/*(Необязательная задача повышенной сложности)
Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
Разность:
A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
B - A = все числа из второй коллекции, которые не содержатся в первой
Симметрическая разность:
A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой */

public class task4 {
    public static void main(String[] args) {
        List <Integer> firstList = getNewList(5);
        List <Integer> secondList = getNewList(5);
        getDifference(firstList, secondList);

    }

    // private static List <Integer> getNewList () {
    //     List <Integer> list = new ArrayList<>();
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Укажите размер списка: ");
    //     int dimention = scanner.nextInt();

    //     for (int i = 0; i < dimention; i++) {
    //         int element = (int)(Math.random()*10);
    //         list.add(i, element);
    //     }

    //     System.out.printf("Сформирован список целых чисел: %s \n", list);
    //     scanner.close();
    //     return list;
    // }

    private static List <Integer> getNewList (int dimention) {
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < dimention; i++) {
            int element = (int)(Math.random()*10);
            list.add(i, element);
        }
        System.out.printf("Сформирован список целых чисел: %s \n", list);
        return list;
    }

private static List <Integer> getDifference (List<Integer> listOne, List<Integer> listTwo) {
    List <Integer> basket = new ArrayList<>();
   
    for (int i = 0; i < listOne.size(); i ++) {
        for (int j = 0; j < listTwo.size(); j ++) {
            if (listOne.get(i) == (listTwo.get(j))) {
                basket.add(listOne.get(i));
            }
        }
    }
    System.out.println(basket);

    
    for (int i = 0; i < listOne.size(); i ++) {
        for (int k = 0; k < basket.size(); k++) {
            if (basket.get(k).equals(listOne.get(i))) listOne.remove(i);
        }
    }
    System.out.println(listOne);


    for (int j = 0; j < listTwo.size(); j ++) {
        for (int k = 0; k < basket.size(); k++) {
            if (basket.get(k).equals(listTwo.get(j))) listTwo.remove(j);
        }
    }
    System.out.println(listTwo);
    

    listOne.addAll (listTwo);
    System.out.println(listOne);

    return basket;
}

}
       
 