package comparablecomparator.bsp1;

import java.util.Comparator;

public class DepartmentAscNameDescComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {

        if(o1.getDepartment().equals(o2.getDepartment()))
            return o2.getName().compareTo(o1.getName());

        return o1.getDepartment().compareTo(o2.getDepartment());
    }
}
