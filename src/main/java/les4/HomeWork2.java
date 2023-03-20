package les4;

import java.util.*;

/**
 * 2. Реализуйте очередь с помощью LinkedList со следующими методами:
 * • enqueue() — помещает элемент в конец очереди,
 * • dequeue() — возвращает первый элемент из очереди и удаляет его,
 * • first() — возвращает первый элемент из очереди, не удаляя.
 */
public class HomeWork2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void start(){
        List<Integer> list = new ArrayList<>(array());
        System.out.println("Работа метода enqueue():");
        System.out.print("Введите добавляемое число: ");
        System.out.println(enqueue(list, scanner.nextInt()));
        System.out.println("Работа метода dequeue():");
        System.out.println(dequeue(list));
        System.out.println(list);
        System.out.println("Работа метода first():");
        System.out.println(first(list));
        System.out.println(list);
    }

    private static List<Integer> enqueue(List<Integer> list, int num){
        list.add(num);
        return list;
    }
    private static Integer dequeue(List<Integer> list){
        return list.remove(0);
    }
    private static Integer first(List<Integer> list){
        return list.get(0);
    }

    public static List<Integer> array(){
        System.out.print("Введите длину массива: ");
        int arr = scanner.nextInt();
        List<Integer> array = new LinkedList<>();
        for (int i = 0; i < arr; i++){
            array.add(new Random().nextInt(0, 10));
        }
        System.out.println(array);
        return array;
    }
}
