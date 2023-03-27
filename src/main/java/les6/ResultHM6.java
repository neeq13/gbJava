package les6;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
 * 2. Создать множество ноутбуков.
 * 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и
 * выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * 1 - ОЗУ
 * 2 - Объём ЖД
 * 3 - Операционная система
 * 4 - Цвет
 */

public class ResultHM6 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void start(){
        filter(add());
    }

    private static List<Notebook> add(){
        List<Notebook> list = new ArrayList<>();
        list.add(new Notebook(8, 512, "Windows", "Red", "Aser"));
        list.add(new Notebook(16, 512, "Mac OS", "Silver", "Apple"));
        list.add(new Notebook(32, 512, "Mac OS", "White", "Apple"));
        list.add(new Notebook(16, 512, "Windows", "Black", "Aser"));
        list.add(new Notebook(8, 512, "Windows", "Red", "HP"));
        return list;
    }

    private static void filter(List<Notebook> list){
        boolean flag = true;
        while (flag){
            System.out.println("Поиск ноутбука по характеристикам: " +
                    "1. Размер ОЗУ " +
                    "2. Размер жёсткого диска " +
                    "3. Операционная система " +
                    "4. Цвет " +
                    "5. Бренд " +
                    "6. Все" +
                    "7. Выход");
            System.out.print("Ваш выбор: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Введите искомый размер памяти: ");
                    int ram = scanner.nextInt();
                    System.out.println(list.stream().filter(notebook -> notebook.getRam() == ram).toList());
                    break;
                case 2:
                    System.out.print("Введите искомый размер памяти: ");
                    int hard = scanner.nextInt();
                    System.out.println(list.stream().filter(notebook -> notebook.getHard() == hard).toList());
                    break;
                case 3:
                    System.out.print("Введите искомый размер памяти: ");
                    String os = scanner.nextLine().toLowerCase();
                    System.out.println(list.stream().filter(notebook -> notebook.getOs().toLowerCase().equals(os)).toList());
                    break;
                case 4:
                    System.out.print("Введите искомый размер памяти: ");
                    String color = scanner.nextLine().toLowerCase();
                    System.out.println(list.stream().filter(notebook -> notebook.getColor().toLowerCase().equals(color)).toList());
                    break;
                case 5:
                    System.out.print("Введите искомый размер памяти: ");
                    String brand = scanner.nextLine().toLowerCase();
                    System.out.println(list.stream().filter(notebook -> notebook.getBrand().toLowerCase().equals(brand)).toList());
                    break;
                case 6:
                    System.out.println(list.toString());
                    break;
                case 7:
                    flag = false;
            }

        }
    }
}
