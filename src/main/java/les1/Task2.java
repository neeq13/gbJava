package les1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    private final Scanner scanner = new Scanner(System.in);

    public void prefix(){
        long count;
        long max = 0;
        String maxPrefix = "";
        System.out.print("Введите искомый префикс: ");
        String prefix = scanner.nextLine().toLowerCase();
        System.out.print("Введите длинну массива: ");
        int arr = scanner.nextInt();
        String[] texts = new String[arr];
        scanner.nextLine();
        for (int i = 0; i < texts.length; i++) {
            System.out.print("Введите строку: ");
            texts[i] = scanner.nextLine();
        }
        for (String text: texts) {
            if (text.equals("")){
                continue;
            }
            if (prefix.equals("") && text.length() > 2){
                prefix = text.substring(0, 2);
            }
            String finalPrefix = prefix;
            count = Arrays.stream(text.split(" "))
                    .filter(s -> finalPrefix.equals(s.substring(0, finalPrefix.length()).toLowerCase())).count();
            if (max < count) {
                max = count;
                maxPrefix = text;
            }
        }
        if (maxPrefix.equals("")){
            System.out.println("\"\"");
        }
        System.out.println(maxPrefix);
    }
}
