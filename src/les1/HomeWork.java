package les1;

import java.util.Scanner;

public class HomeWork {
    private final Scanner scanner = new Scanner(System.in);
    private final Calk calk = new Calk();

    public void trianAndFactorial(){
        System.out.print("Введите какое треугольное число и n! хотите найти: ");
        int n = scanner.nextInt();
        int trian = 0;
        int fact = 1;
        if(n != 0) {
            for (int i = 1; i <= n; i++) {
                trian += i;
                fact *= i;
            }
            System.out.printf("Треугольное число = %s, факториал = %s \n", trian, fact);
        }else {
            System.out.println("Треугольное число = 1, факториал = 1");
        }
    }

    public void primeNumber(){
        StringBuilder builder = new StringBuilder();
        int temp = 0;
        for(int i = 1; i <= 1000; i+=2){
            for (int j = 1; j <= 1000; j+=2){
                if(i % j == 0 && j != i && j != 1){
                    temp = 0;
                    break;
                }else {
                    temp++;
                }
            }
            if(temp != 0) {
                builder.append(i).append(" ");
            }
        }
        System.out.println(builder);
    }

    public void calculator(){
        boolean flag = true;
        while (flag){
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Введите операцию в виде(+, -, /, *), для выхода напишите q: ");
            String str = scanner.nextLine();
            switch (str){
                case "+":
                    System.out.println(calk.sum(a, b));
                    break;
                case "-":
                    System.out.println(calk.sub(a, b));
                    break;
                case "/":
                    if(calk.div(a, b) == 0){
                        System.out.println("Деление на 0 запрещено");
                    }else {
                        System.out.println(calk.div(a, b));
                    }
                    break;
                case "*":
                    System.out.println(calk.mul(a, b));
                    break;
                case "q":
                    flag = false;
            }
        }
    }

    public void equation(){
        System.out.println("Задайте уравнение вида 2? + ?5 = 69");
        System.out.print("Первое число: ");
        String str1 = scanner.nextLine();
        System.out.print("Второе число: ");
        String str2 = scanner.nextLine();
        System.out.print("Чему равно: ");
        int result = scanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                StringBuilder temp1 = new StringBuilder();
                StringBuilder temp2 = new StringBuilder();
                if (str1.charAt(0) == '?') {
                    temp1.append(j).append(str1.charAt(1));
                } else {
                    temp1.append(str1.charAt(0)).append(j);
                }
                if (str2.charAt(0) == '?') {
                    temp2.append(i).append(str2.charAt(1));
                } else {
                    temp2.append(str2.charAt(0)).append(i);
                }
                if (Integer.parseInt(temp1.toString().trim()) + Integer.parseInt(temp2.toString().trim()) == result) {
                    System.out.printf("Уравнение будет иметь вид %s + %s = %s", temp1, temp2, result);
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("Решения нет");
        }
    }

}
