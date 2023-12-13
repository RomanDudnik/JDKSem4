package Collections;
import java.util.*;
/*
    Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
    Получите уникальный список Set на основании List
    Определите наименьший элемент (алфавитный порядок)
    Определите наибольший элемент (по количеству букв в слове но вывести это имя в обратном порядке)
    Удалите все элементы содержащие букву ‘A’


 */


import java.util.ArrayList;
import java.util.Set;

public class Task2 {
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
        names.add("Mark");
        names.add("Jane");
        names.add("TJ");

        System.out.println(names);
        //Получите уникальный список Set на основании List
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);

        //Определите наименьший элемент (алфавитный порядок)
        String minName = uniqueNames.stream().sorted().toList().get(0);
        System.out.println(minName);

        // Определите наибольший элемент (по количеству букв в слове, но вывести это имя в обратном порядке)
        String maxName = uniqueNames.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(new StringBuilder(maxName).reverse());

        //Удалите все элементы содержащие букву ‘A’
        // names.removeIf(name -> name.contains("A"));  // Lambda
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().contains("A")) {
                iterator.remove();
            }
        }
        System.out.println(names);
    }
}
