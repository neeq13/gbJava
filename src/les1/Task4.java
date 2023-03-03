package les1;

import java.util.Scanner;

public class Task4 {
    private final Scanner scanner = new Scanner(System.in);

    public void degree(){
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        System.out.print("Введите степень: ");
        int b = scanner.nextInt();

        System.out.println(Math.pow(a, b));
    }
}
