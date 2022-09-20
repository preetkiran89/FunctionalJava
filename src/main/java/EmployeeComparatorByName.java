import java.util.Comparator;

public class EmployeeComparatorByName implements Comparator<Employee> {

    /*To be used when the legacy code, Employee cannot be modified
            https://www.baeldung.com/java-comparator-comparable
            * */
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}
