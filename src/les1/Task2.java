package les1;

import java.util.Scanner;

public class Task2 {
    private final Scanner scanner = new Scanner(System.in);

    public void prefix(){
        int count = 0;
        int max = 0;
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
            for (String str : text.split(" ")) {
                if (str.equals("")){
                    continue;
                }
                if (prefix.equals("") && str.length() > 2){
                    prefix = str.substring(0, 2);
                }
                if (prefix.equals(str.substring(0, prefix.length()).toLowerCase())) {
                    count++;
                    if (max < count) {
                        max = count;
                        maxPrefix = text;
                    }
                }
            }
            count = 0;
        }
        if (maxPrefix.equals("")){
            System.out.println("\"\"");
        }
        System.out.println(maxPrefix);
    }
}
