package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
  Создайте коллекцию мужских и женских имен с помощью интерфейса List
  Отсортируйте коллекцию в алфавитном порядке
  Отсортируйте коллекцию по количеству букв в слове
  Разверните коллекцию
 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Mary");
        names.add("TJ");
        names.add("Mark");
        names.add("Bob");
        names.add("Kate");
        names.add("Alexey");

        System.out.println(names);
        //Отсортируйте коллекцию в алфавитном порядке
        Collections.sort(names);
        System.out.println(names);
        //Отсортируйте коллекцию по количеству букв в слове
        //Collections.sort(names, (s1, s2) -> s1.length() - s2.length());
        names.sort(Comparator.comparingInt(String::length));
        System.out.println(names);
        //Разверните коллекцию
        Collections.reverse(names);
        System.out.println(names);
    }
}
