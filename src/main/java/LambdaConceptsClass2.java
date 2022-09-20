import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaConceptsClass2 {
    private int sum(int a, int b) {
        System.out.println("Values" + a + "," +b);//Basically reduce does - (aggregate, nextNumber)
        return a+b;
    }
    public static void main(String[] args) {
        List<Integer> testList = List.of(34,56,23,87,11,22,9,-1);
        //int sum = testList.stream().reduce(0, new LambdaConceptsClass2()::sum);//To sum up numbers in a list
        //Either above line using functional programming OR below one

        int sum = testList.stream().reduce(0, (x, y) -> x +y);
        System.out.println("The SUM is = " + sum);

        int max = testList.stream().reduce(0, (x,y) -> (x>y)?x:y);
        System.out.println("Comparing 2 & returning Maximum:" + max);

        int min = testList.stream().reduce(Integer.MIN_VALUE, (x,y) -> x>y?y:x);
        System.out.println("Printing Minimum number:" + min);
    }
}
