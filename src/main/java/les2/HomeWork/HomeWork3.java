package les2.HomeWork;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 3.** Дана json строка (можно сохранить в файл и читать из файла)
 * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
 * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
 * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
 * Написать метод(ы), который распарсит json и, используя StringBuilder,
 * создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
 * Пример вывода:
 * Студент Иванов получил 5 по предмету Математика.
 * Студент Петрова получил 4 по предмету Информатика.
 * Студент Краснов получил 5 по предмету Физика.
 */
public class HomeWork3 {
    private final ObjectMapper mapper = new ObjectMapper();

    public void builder() {
        List<Student> students;
        try {
            String filepath = "src/main/java/les2/HomeWork/files/package.json";
            students = mapper.readValue(new File(filepath), new TypeReference<>(){});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(Student student: students){
            System.out.println(new StringBuilder()
                    .append("Студент ")
                    .append(student.getSurname())
                    .append(" получил ")
                    .append(student.grade)
                    .append(" по предмету ")
                    .append(student.item)
                    .append("."));
        }
    }
}
