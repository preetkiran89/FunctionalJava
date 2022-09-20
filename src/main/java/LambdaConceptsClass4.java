import java.util.Comparator;
import java.util.List;

public class LambdaConceptsClass4 {
    public static void main(String[] args) {
        //Intermediate Operations - returns Stream<K> back
        //Terminal operations - dont return Stream back, like forEach, collect
        List<Employee> empList = List.of(
                new Employee(61,"Preet", 10000, 33, "Toronto"),
                new Employee(70,"Amol", 15000, 25, "Vancouver"),
                new Employee(71,"Harkirat", 21000, 24, "San Jose"),
                new Employee(72,"Vaishali", 11000, 25, "Vancouver"),
                new Employee(73,"Pisti", 10009, 33, "Toronto"),
                new Employee(74,"Bruno", 20000, 19, "Vancouver"),
                new Employee(75,"Matty's Patty", 90000, 33, "San Jose"),
                new Employee(76,"Violet", 95800, 24, "Toronto")
        );

        System.out.println("Print using natural order:");
        empList.stream().sorted(Comparator.naturalOrder()).forEach(p-> System.out.println(p.getEmpID()));

        System.out.println("Print using reverse order:");
        empList.stream().sorted(Comparator.reverseOrder()).forEach(p-> System.out.println(p.getEmpID()));

        System.out.println("Print reverse sorted emp by name:");
        //empList.stream().sorted(Comparator.reverseOrder()).forEach(p-> System.out.println(p.getEmpName()));
        empList.stream().sorted(new EmployeeComparatorByName().reversed()).forEach(p->System.out.println(p.getEmpName()));

        System.out.println("Print sorted emp by name:");
        //empList.stream().sorted(Comparator.naturalOrder()).forEach(p-> System.out.println(p.getEmpName()));
        //Above sorts but like natural as list was defined same sequence, & reverse means opposite of how list defined
        empList.stream().sorted(new EmployeeComparatorByName()).forEach(p -> System.out.println(p.getEmpName()));

        System.out.println("Print sorted by empName length:");
        empList.stream().sorted(Comparator.comparing(p -> p.getEmpName().length())).
                forEach(p-> System.out.println(p.getEmpName() +"-" + p.getEmpName().length()));


    }
}
