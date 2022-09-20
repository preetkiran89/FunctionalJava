import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparatorAble {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(214, "AmolNotBonga"));
        employeeList.add(new Employee(124, "Preet"));
        employeeList.add(new Employee(94, "Harkirat"));

        System.out.println("Before sorting by Comparable:");
        employeeList.forEach(p-> System.out.println(p.getEmpID()));
        System.out.println("After sorting by Comparable:");
        Collections.sort(employeeList);
        employeeList.forEach(p-> System.out.println(p.getEmpID()));

        System.out.println("Using Comparator::::::");
        System.out.println("Before sorting by name:");
        employeeList.forEach(p-> System.out.println(p.getEmpName()));
        System.out.println("After sorting:");
        Collections.sort(employeeList,new EmployeeComparatorByName());
        employeeList.forEach(p-> System.out.println(p.getEmpName()));
    }
    //max age,salary, group by age, city, & order by as well
}