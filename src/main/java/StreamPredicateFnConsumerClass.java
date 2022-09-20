import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamPredicateFnConsumerClass {
    public static void main(String[] args) {
        List<String> test = List.of("Apple", "Cat", "Bear");

        Predicate<String> isApplePredicate0 = p -> p.equals("Apple");
        Predicate<String> isApplePredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("Apple");
            }
        };

        Function<String, String> convertToFun0 = p -> "Apple2";
        Function<String, String> convertToFun = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return "Apple2";
            }
        };

        Consumer<String> printForEach0 = System.out::println;
        Consumer<String> printForEach = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
//        test.stream()
//                .filter(p -> p.equals("Apple"))               //Predicate accepts input & returns boolean
//                .map(p -> "Apple2")                          //Function accepts input & returns output
//                .forEach(System.out::println);              //Consumer accepts input & returns no result
        test.stream().filter(isApplePredicate).map(convertToFun).forEach(printForEach);
    }
}