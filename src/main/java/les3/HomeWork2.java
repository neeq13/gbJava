package les3;

import java.util.*;

/**
 *     2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
 * */
public class HomeWork2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void array(){
        System.out.print("Введите длину массива: ");
        int arr = scanner.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arr; i++){
            array.add(new Random().nextInt(0, 10));
        }
        System.out.println(array);
        System.out.println(dontEven(array));
    }

    private static List<Integer> dontEven(List<Integer> array){
        List<Integer> list = new ArrayList<>();
        for (int i: array){
            if(i == 0){
                list.add(i);
                continue;
            }
            if(i % 2 != 0){
                list.add(i);
            }
        }
        return list;
    }

}
