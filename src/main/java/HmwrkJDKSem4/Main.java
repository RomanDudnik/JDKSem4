package HmwrkJDKSem4;
/*
    Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
    - Табельный номер
    - Номер телефона
    - Имя
    - Стаж
    Добавить метод, который ищет сотрудника по стажу (может быть список)
    Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
    Добавить метод, который ищет сотрудника по табельному номеру
    Добавить метод добавление нового сотрудника в справочник сотрудников
 */
public class Main {

    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmployee(1, "8923122121", "John", 7);
        directory.addEmployee(2, "8911093233", "Jane", 5);
        directory.addEmployee(3, "8921345954", "Mary", 3);
        directory.addEmployee(4, "8921345954", "TJ", 1);
        directory.addEmployee(5, "8921345954", "Igor", 3);

        System.out.println(directory.findByExperience(3));
        System.out.println(directory.findPhoneByName("Jane"));
        System.out.println(directory.findById(4));
    }
}
