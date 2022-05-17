package comparablecomparator.bsp1;

import java.util.Arrays;
public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(666, "Pat", 3000.00, "R&D");
        Employee e2 = new Employee(798, "Leo", 2500.00, "Finance");
        Employee e3 = new Employee(5, "Matt", 3200.00, "Management");
        Employee e4 = new Employee(8, "Klaus", 3800.00, "R&D");
        Employee e5 = new Employee(999, "Simon", 4700.00, "Management");
        Employee e6 = new Employee(123, "Daniel", 3200.00, "Art");
        Employee e7 = new Employee(27, "Lisa", 3000.00, "Art");

        Employee[] employees = {e1, e2, e3, e4, e5, e6, e7};

        System.out.println("<<< Initial Array >>>");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }


        System.out.println("");
        System.out.println("<<< Sorted Array >>>");
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("");
        System.out.println("<<< Sorted Array: NameAscComparator >>>");
        Arrays.sort(employees, new NameAscComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("");
        System.out.println("<<< Sorted Array: SalaryDescComparator >>>");
        Arrays.sort(employees, new SalaryDescComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("");
        System.out.println("<<< Sorted Array: DepartmentAscNameDescComparator >>>");
        Arrays.sort(employees, new DepartmentAscNameDescComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("");
        System.out.println("<<< Sorted Array: SalaryAscNameAscComparator >>>");
        Arrays.sort(employees, new SalaryAscNameAscComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}
