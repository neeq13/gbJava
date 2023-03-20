package les4;

import java.util.*;

/**
 * 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёт «перевёрнутый» список.
 */

public class HomeWork1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void start(){
        System.out.println(easy(array()));
        System.out.println(myMethod(array()));
    }

    private static List<Integer> easy(List<Integer> list){
        Collections.reverse(list);
        return list;
    }
    private static List<Integer> myMethod(List<Integer> list){
        List<Integer> reverse = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverse.add(list.get(i));
        }
        return reverse;
    }

    public static List<Integer> array(){
        System.out.print("Введите длину массива: ");
        int arr = scanner.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arr; i++){
            array.add(new Random().nextInt(0, 10));
        }
        System.out.println(array);
        return array;
    }
}
