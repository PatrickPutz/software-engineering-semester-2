package comparablecomparator;

import java.util.Arrays;
public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(666, "Pat", 3000.00, "R&D");
        Employee e2 = new Employee(798, "Leo", 2500.00, "Finance");
        Employee e3 = new Employee(5, "Matt", 3200.00, "Management");

        Employee[] employees = {e1, e2, e3};

        System.out.println("<<< Initial Array >>>");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        Arrays.sort(employees);

        System.out.println("<<< Sorted Array >>>");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
