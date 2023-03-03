package les1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    private final Scanner scanner = new Scanner(System.in);

    public void equality(){
        System.out.print("Задайте длинну массива: "); // Данные строчки тогда нужно закомментировать
        int a = scanner.nextInt(); // Данные строчки тогда нужно закомментировать
        int[] nums = new int[a]; // Данные строчки тогда нужно закомментировать
//        int[] nums = {1, 7, 3, 6, 5, 6}; todo: Данное значение можно раскомментировать чтобы проверить работу метода
        int sumDo = 0;
        int sumNext = 0;
        int result = 0;
        int mean = 0;
        for (int i = 0; i < nums.length; i++){ // Данные строчки тогда нужно закомментировать
            nums[i] = new Random().nextInt(10); // Данные строчки тогда нужно закомментировать
        } // Данные строчки тогда нужно закомментировать
        for (int i = 1; i < nums.length; i++){
            sumDo += nums[i - 1];
            for(int j = i + 1; j < nums.length; j++){
                sumNext += nums[j];
            }
            if(sumDo == sumNext){
                result = i;
                mean = nums[i];
                break;
            }
            sumNext = 0;
        }
        System.out.println(Arrays.toString(nums));
        if(result == 0){
            System.out.println("Решения нет");
        }else {
            System.out.printf("Искомый индек = %s, его значение = %s",result, mean);
        }
    }
}
