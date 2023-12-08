package Map;
import java.util.*;
/*
    Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение.
    Найдите человека с самым маленьким номером телефона.
    Найдите номер телефона человека чье имя самое большое в алфавитном порядке.
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("1455666253","Ivan");
        phoneBook.put("4897897756", "Petr");
        phoneBook.put("7121344389", "Sidor");
        phoneBook.put("3213899321", "Vasya");
        phoneBook.put("1243566654", "Kolya");

        //Найдите человека с самым маленьким номером телефона
        String minPhone = phoneBook.keySet().stream().sorted().findFirst().get();
        System.out.println(phoneBook.get(minPhone));

        //Найдите номер телефона человека чье имя самое большое в алфавитном порядке
        String maxValue = phoneBook.values().stream().sorted((s1, s2)-> -s1.compareTo(s2)).findFirst().get();
        System.out.println(maxValue);

        //Найдите номер телефона человека чье имя самое большое в алфавитном порядке
        System.out.println(phoneBook.entrySet()
                .stream().filter((entry) -> entry.getValue().equals(maxValue)).findAny().get());
    }
}
