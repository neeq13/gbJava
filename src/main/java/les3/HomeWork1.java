package les3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *     1. Реализовать алгоритм сортировки слиянием
 * */
public class HomeWork1 {
    private static final Scanner scanner = new Scanner(System.in);

    private static int[] sorted(int[] array){
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }
        int [] arrayB = new int[array.length / 2];
        System.arraycopy(array, 0, arrayB, 0, array.length / 2);

        int [] arrayC = new int[array.length - array.length / 2];
        System.arraycopy(array, array.length / 2, arrayC, 0, array.length - array.length / 2);

        arrayB = sorted(arrayB);
        arrayC = sorted(arrayC);

        return merge(arrayB, arrayC);
    }

    private static int[] merge(int[] arrayA, int[] arrayB){
        int[] arrayC = new  int[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length){
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else if (arrayA[positionA] < arrayB[positionB]) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return arrayC;
    }

    public static void array(){
        System.out.print("Введите длину массива: ");
        int arr = scanner.nextInt();
        int[] array = new int[arr];
        for (int i = 0; i < array.length; i++){
            array[i] = new Random().nextInt(0, 10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sorted(array)));
    }
}
