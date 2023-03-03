package les1;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    private final Scanner scanner = new Scanner(System.in);

    public void viceVersa(){
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        String[] texts = text.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = texts.length - 1; i >= 0; i--){
            if(i != 0) {
                stringBuilder.append(texts[i]).append(" ");
            }else {
                stringBuilder.append(texts[i]);
            }
        }

        System.out.println(String.valueOf(stringBuilder));
    }
}
