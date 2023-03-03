package les1;

import java.time.LocalTime;
import java.util.Scanner;

public class Task1 {
    private final Scanner scanner = new Scanner(System.in);
    public void hello(){
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        System.out.println(LocalTime.now());
        if (time.isAfter(LocalTime.parse("04:59:59.999999999")) && time.isBefore(LocalTime.parse("12:00:00.000000000"))){
            System.out.println("Доброе утро, " + name + "!");
        }else if (time.isAfter(LocalTime.parse("11:59:59.999999999")) && time.isBefore(LocalTime.parse("18:00:00.000000000"))){
            System.out.println("Добрый день, " + name + "!");
        }else if (time.isAfter(LocalTime.parse("17:59:59.999999999")) && time.isBefore(LocalTime.parse("23:00:00.000000000"))){
            System.out.println("Добрый вечер, " + name + "!");
        }else if (time.isAfter(LocalTime.parse("22:59:59.999999999")) && time.isBefore(LocalTime.parse("05:00:00.000000000"))){
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}
