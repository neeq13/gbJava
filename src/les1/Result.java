package les1;

import java.io.IOException;

public class Result {
    private static final Task1 task1 = new Task1();
    private static final Task2 task2 = new Task2();
    private static final Task3 task3 = new Task3();
    private static final Task4 task4 = new Task4();
    private static final Task5 task5 = new Task5();
    private static final Task6 task6 = new Task6();
    private static final Task7 task7 = new Task7();
    private static final HomeWork home = new HomeWork();

    public static void result() throws IOException {
        System.out.println("Дополнительное задание 1");
        task1.hello();
        System.out.println("Дополнительное задание 2");
        task2.prefix();
        System.out.println("Дополнительное задание 3");
        task3.viceVersa();
        System.out.println("Дополнительное задание 4");
        task4.degree();
        System.out.println("Дополнительное задание 5");
        task5.solution();
        System.out.println("Дополнительное задание 6");
        task6.equality();
        System.out.println("Дополнительное задание 7");
        task7.saveFile();
        System.out.println("Домашнее задание 1");
        home.trianAndFactorial();
        System.out.println("Домашнее задание 2");
        home.primeNumber();
        System.out.println("Домашнее задание 3");
        home.calculator();
        System.out.println("Домашнее задание 4");
        home.equation();
    }
}
