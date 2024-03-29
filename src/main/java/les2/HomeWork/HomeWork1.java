package les2.HomeWork;


import com.google.gson.Gson;
import org.json.JSONObject;

import java.util.Map;

/**
    1. Дана строка sql-запроса "select * from students where ".
        Сформируйте часть WHERE этого запроса, используя StringBuilder.
        Данные для фильтрации приведены ниже в виде json строки.
        Если значение null, то параметр не должен попадать в запрос.
        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
*/

public class HomeWork1 {
    public void sqlWhere() {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("select * from students where ");
        String jStr = "{[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},\n" +
                " * {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},\n" +
                " * {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]}";
        JSONObject jsonObj = new JSONObject(jStr);
        Map<String, String> map = new Gson().fromJson(jsonObj.toString(), Map.class);
        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry);
        }
        System.out.println(sb);
    }
}
