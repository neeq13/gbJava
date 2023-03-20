package les5;

import java.util.HashMap;
import java.util.Map;

/**
 * 2. Пусть дан список сотрудников:
 * Иван Иванов
 * Светлана Петрова
 * Кристина Белова
 * Анна Мусина
 * Анна Крутова
 * Иван Юрин
 * Петр Лыков
 * Павел Чернов
 * Петр Чернышов
 * Мария Федорова
 * Марина Светлова
 * Мария Савина
 * Мария Рыкова
 * Марина Лугова
 * Анна Владимирова
 * Иван Мечников
 * Петр Петин
 * Иван Ежов
 * Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */
public class HomeWork2 {

    public static void start(){
        Map<String, String> map = new HashMap<>();
        Map<String, Integer> rating = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Иван");
        map.put("Белова", "Кристина");
        map.put("Мусина", "Анна");
        map.put("Крутова", "Анна");
        map.put("Юрин", "Иван");
        map.put("Лыков", "Петр");
        map.put("Чернов", "Павел");
        map.put("Чернышов", "Петр");

        for(String name: map.values()){
            int count = 0;
            for (String str: map.values()){
                if (str.equals(name))
                    count++;
            }
            rating.put(name, count);
        }
        for (int i = 0; i < rating.size(); i++) {
            System.out.println(rating.entrySet().stream().filter(x -> x.getValue() == rating.values().stream().max(Integer::compare).get()).toList());
            rating.entrySet().removeIf(e -> e.getValue() == rating.values().stream().max(Integer::compare).get());
        }
        System.out.println(rating);

    }

}
