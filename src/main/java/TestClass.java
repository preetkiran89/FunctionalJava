import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<Person> listPersons = new ArrayList<Person>();
        listPersons.add(new Person("Preet", 32, "Female"));
        listPersons.add(new Person("Alex", 33, "Male"));
        listPersons.add(new Person("Yulia", 32, "Female"));
        listPersons.add(new Person("XYZ", 32, "Male"));

        List<Person> listPersons2 = List.of(
                new Person("test1", 30, "Female"),
                        new Person("Amol", 31, "Male"));

        for(Person p : listPersons) {
            if(p.getGender().equals("Female"))
                System.out.println(p.getName() + p.getGender());
        }
        listPersons.stream().filter(p -> p.getGender().equals("Female")).collect(Collectors.toList()).
                forEach(System.out::println);
    }

    static class Person {
        private String name;
        private int age;
        private String gender;

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }
}
