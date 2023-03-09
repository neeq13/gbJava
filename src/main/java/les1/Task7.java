package les1;

import java.io.*;
import java.util.Scanner;

public class Task7 {
    private File file = new File("src/les1/file.txt");
    private final Scanner scanner = new Scanner(System.in);

    public void saveFile() throws IOException {
        String str = "Name Surname Age";
        int choice = 0;
        if(!file.exists()){
            System.out.println("Создайте файл");

        }
        FileWriter writer = new FileWriter(file, true);

        if(file.length() == 0){
            writer.write(str);
            writer.append("\n");
        }
        while (choice != 3){
            System.out.println("Введите 1 - чтобы добавить запись, 2 - чтобы прочитать все записи, 3 - выйти");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите фамилию: ");
                    String surname = scanner.nextLine();
                    System.out.print("Введите возраст: ");
                    String age = scanner.nextLine();
                    writer.append(name);
                    writer.append(" ");
                    writer.append(surname);
                    writer.append(" ");
                    writer.append(age);
                    writer.append("\n");
                    writer.flush();
                    continue;
                case 2:
                    FileReader reader = new FileReader(file);
                    int c;
                    while((c=reader.read())!=-1){
                        System.out.print((char)c);
                    }
                    reader.close();
            }
        }
        writer.close();
    }
}
