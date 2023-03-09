package les2.HomeWork;

import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 *     2. Реализуйте алгоритм сортировки пузырьком числового массива,
 *     результат после каждой итерации запишите в лог-файл.
 * */
public class HomeWork2 {
    private final Scanner scanner = new Scanner(System.in);
    private Logger log;
    {
        try(FileInputStream ins = new FileInputStream("src/main/resources/logger.properties")){
            LogManager.getLogManager().readConfiguration(ins);
            log = Logger.getLogger(HomeWork2.class.getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void bubble (){
        System.out.print("Введите длинну массива: ");
        int arr = scanner.nextInt();
        int[] nums = new int[arr];
        for (int i = 0; i < nums.length; i++){
            nums[i] = new Random().nextInt(10);
            log.info(String.valueOf(nums[i]));
        }
    }
}
