package les1;

import java.util.Scanner;

public class Task5 {
    private final Scanner scanner = new Scanner(System.in);

    public void solution(){
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите множитель: ");
        int c = scanner.nextInt();
        System.out.print("Введите слогаемое: ");
        int d = scanner.nextInt();
        int sum = a;
        int mul = a;
        StringBuilder result = new StringBuilder();
        StringBuilder result2 = new StringBuilder();

        if (a > b){
            System.out.println("Решения нет");
        }
        if (a == b){
            System.out.println("Числа равны");
        }else {
            while (true) {
                if (sum != b) {
                    sum += d;
                    if (sum == b) {
                        result.append("k1");
                    } else if (sum < b){
                        result.append("k1, ");
                    }
                }
                if (mul != b) {
                    if (b > mul * c) {
                        mul *= c;
                        result2.append("k2, ");
                    } else if (b == mul * c) {
                        mul *= c;
                        result2.append("k2");
                    } else {
                        mul += d;
                        if(mul < b) {
                            result2.append("k1, ");
                        }else if(mul == b){
                            result2.append("k1");
                        }
                    }
                }
                if (sum == b && mul == b) {
                    break;
                }
                if ((mul * c > b && mul + d > b) && sum + d > b) {
                    break;
                }
            }
            if (sum == b && mul == b) {
                System.out.println(result + " или " + result2);
            } else if (sum == b) {
                System.out.println(result);
            } else if (mul == b) {
                System.out.println(result2);
            } else {
                System.out.println("Решения нет");
            }
        }
    }
}
