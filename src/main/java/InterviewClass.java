 import java.util.List;

 // class named 'Program' is necessary to run Java
 public class InterviewClass {
        // 'public static void main' method is also required
        public static void main(String[] args) {
            System.out.println("Hello CodingView!");

            List<String> animals = List.of("Cat",
                    "Apple",
                    "Bear");
            new InterviewClass().method1(animals);
//            System.out.println("//Structured approach");
//            method2(List.of(87,45,36,23,17,78,89));
//            System.out.println("//Functional approach");
//            new InterviewClass().functionalApproach(List.of(87,45,36,23,17,78,89));
            System.out.println("//Functional approach: Print only even numbers");
            new InterviewClass().functionalPrintEven(List.of(87,45,36,23,17,78,89));
            new InterviewClass().printFilteredString(List.of("Spring", "Spring Boot", "Java", "API", "Microservices"));
        }

            private void method1(List<String> arg1) {
                arg1.stream().sorted().forEach(p -> System.out.println(p));
            }
            private static void method2(List<Integer> numbers) {numbers.stream().forEach(p -> System.out.println(p));}
            private void functionalApproach(List<Integer> numbers) {
                numbers.stream().sorted().forEach(this::print);//Method Reference used here
                numbers.stream().sorted().forEach(System.out::println);//Similar as above
            }
            private void functionalPrintEven(List<Integer> numbers) {
                numbers.stream().filter(p -> p%2 == 0).forEach(System.out::println);
            }
            private void print(int number) {
                System.out.println(number);
            }

            private void printFilteredString(List<String> stringList) {
                stringList.stream().filter(p-> p.contains("Spring")).forEach(System.out::println);
            }
    }
