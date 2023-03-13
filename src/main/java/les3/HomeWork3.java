package les3;

import java.util.*;

/**
 *     3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 * */
public class HomeWork3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void array(){
        System.out.print("Введите длину массива: ");
        int arr = scanner.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arr; i++){
            array.add(new Random().nextInt(0, 10));
        }
        System.out.println(array);
        if (array.size() != 0) {
            System.out.println("Min: " + array.stream().min(Integer::compareTo).get());
            System.out.println("Max: " + array.stream().max(Integer::compareTo).get());
            System.out.println("Среднее арифметическое: " + average(array));
        }
        List<Integer> middle = new ArrayList<>(middle(array));
        if(middle.size() == 2) {
            System.out.println("Средних элементов списка 2 и это: " + middle);
        } else if (middle.size() == 1) {
            System.out.println("Средний элемент списка: " + middle);
        }else {
            System.out.println("Список пуст");
        }
    }

    private static double average(List<Integer> list){
        return (double)list.stream().reduce(0, Integer::sum) / list.size();
    }

    private static List<Integer> middle(List<Integer> list){
        int count = list.size() / 2;
        List<Integer> ints = new ArrayList<>();
        if (list.size() % 2 != 0){
            count = list.size() / 2 + 1;
            for (int i: list){
                if(count == 1){
                    ints.add(i);
                    return ints;
                }
                count--;
            }
        }
        for (int i: list){
            if(count == 1){
                ints.add(i);
            }
            if(count == 0){
                ints.add(i);
                break;
            }
            count--;
        }
        return ints;
    }
}
