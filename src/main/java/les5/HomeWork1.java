package les5;


import java.util.*;

import static org.apache.commons.lang3.StringUtils.capitalize;


/**
 * 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
 * что 1 человек может иметь несколько телефонов.
 */
public class HomeWork1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void phone(){
        Map<String, List<String>> map = new HashMap<>();
        boolean flag = true;

        while (flag){
            System.out.println("1 -> Добавить нового человека в телефонный справочник");
            System.out.println("2 -> Добавить человеку в телефонный справочник новый номер");
            System.out.println("3 -> Просмотреть телефонный справочник");
            System.out.println("4 -> Выйти");
            System.out.print("Что выберете: ");
            int result = scanner.nextInt();
            scanner.nextLine();
            switch (result) {
                case 1 -> {
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.println(capitalize(name));
                    System.out.println("Будете сразу добавлять телефон? 1 - Да, 2 - Нет");
                    if (scanner.nextInt() == 1) {
                        newPhone(map, name);
                    } else
                        map.put(capitalize(name), new ArrayList<>());
                }
                case 2 -> {
                    System.out.print("Введите имя человека которому хотите добавить номер: ");
                    String str = scanner.nextLine();
                    if (map.containsKey(capitalize(str)))
                        newPhone(map, str);
                    else {
                        System.out.println("Такого имени в справочнике нет");
                        System.out.println("Доступные имена в справочнике");
                        System.out.println(map.keySet());
                    }
                }
                case 3 -> System.out.println(map);
                case 4 -> flag = false;
            }
        }

    }

    private static void newPhone(Map<String, List<String>> map, String name) {
        List<String> list;
        if(!map.containsKey(name))
            list = new ArrayList<>();
        else
            list = new ArrayList<>(map.get(name));
        do {
            scanner.toString();
            System.out.print("Введите телефон: ");
            String temp = scanner.nextLine();
            list.add(temp);
            System.out.println("Хотите добавить ещё один номер? Если Нет введите -> 1");
        } while (scanner.nextInt() != 1);
        map.put(capitalize(name), list);
    }
}
