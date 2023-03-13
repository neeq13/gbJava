package les3;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    private final Scanner scanner = new Scanner(System.in);

    public void booksMarket(){
        int count = 1;
        List<ArrayList<String>> market = new ArrayList<>();
        while (true){
            System.out.println("Введите название жанра или 1 для выхода: ");
            String genre = StringUtils.capitalize(scanner.nextLine());
            if(genre.equals("1")){
                break;
            }
            ArrayList<String> books = new ArrayList<>();
            books.add(genre);
            while (true){
                System.out.println("Введите название книги или 1 для выхода: ");
                String book = StringUtils.capitalize(scanner.nextLine());
                if(book.equals("1")){
                    break;
                }
                books.add(book);
            }
            market.add(books);
        }
        for (List<String> books: market){
            for (int i = 0; i < books.size(); i++){
                if (i == 0){
                    System.out.println(count + "-й жанр " + books.get(i) + ":");
                } else {
                    System.out.println(i + "-я книга: " + books.get(i));
                }
                if (i + 1 >= books.size() && i + 1 < 2) {
                    System.out.println("Книг в данном жанре нет");
                }
            }
            count++;
            System.out.println("-------");
        }
    }
}
