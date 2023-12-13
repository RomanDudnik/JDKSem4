package HmwrkJDKSem4;

import java.util.List;
import java.util.ArrayList;

public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        employees = new ArrayList<>();
    }

    public void addEmployee(int id, String phone, String name, int experience) {
        Employee employee = new Employee(id, phone, name, experience);
        employees.add(employee);
    }

    public List<Employee> findByExperience(int experience) {
        List<Employee> foundEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                foundEmployees.add(employee);
            }
        }
        return foundEmployees;
    }

    public List<String>findPhoneByName(String name) {
        List<String> foundPhones = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                foundPhones.add(employee.getPhone());
            }
        }
        return foundPhones;
    }

    public Employee findById(int number) {
        for(Employee employee : employees) {
            if (employee.getId() == number) {
                return employee;
            }
        }
        return null;
    }
}
