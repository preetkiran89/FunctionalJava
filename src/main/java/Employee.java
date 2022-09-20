public class Employee implements  Comparable<Employee> {
    int empID;
    String empName;
    double salary;
    int age;
    String city;

    public Employee(int empID, String empName, double salary, int age, String city) {
        this.empID = empID;
        this.empName = empName;
        this.salary = salary;
        this.age = age;
        this.city = city;
    }

    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(getEmpID(),o.getEmpID());
    }
}
