import java.util.List;
import java.util.stream.Collectors;

public class LambdaConceptsClass3 {
    public static void main(String[] args) {
        List<Integer> testList = List.of(2,3,1,4,2,3);

        double sumofSquares = testList.stream().reduce(0, (x,y) -> x + y*y);
        System.out.println("Square every number & find sum of squares::" + sumofSquares);

        Integer reduce = testList.stream().filter(p -> p % 2 != 0).reduce(0, (x, y) -> x + y);
        System.out.println("Sum of odd numbers:" + reduce);

        System.out.println("Print distinct numbers:");
        testList.stream().distinct().forEach(System.out::println);

        System.out.println("Print sorted numbers:");
        testList.stream().sorted().forEach(p-> System.out.println(p));
    }
}