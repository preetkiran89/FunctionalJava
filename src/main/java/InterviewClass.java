 import java.io.*;
 import java.util.List;

 // class named 'Program' is necessary to run Java
    class InterviewClass {
        // 'public static void main' method is also required
        public static void main(String[] args) {
            System.out.println("Hello CodingView!");

            List<String> animals = List.of("Cat",
                    "Apple",
                    "Bear");
            new InterviewClass().method1(animals);
        }

            private void method1(List<String> arg1) {
                arg1.stream().sorted().forEach(p -> System.out.println(p));
            }
    }
