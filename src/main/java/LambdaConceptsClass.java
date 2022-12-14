import importsStatic.MaxSpeedOfCar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

//import static MaxSpeedOfCar.getMaxSpeed; Need to define 2 in different packages & not default

public class LambdaConceptsClass {
    public static void main(String[] args) {
        MaxSpeedOfCar.getMaxSpeed();
        new DateTimeExample().getAllDates();

//        LambdaExpressions d = ( int x,  int y) -> {
//            return x + y;
//        };
//        System.out.println("getAddition=" + d.getAddition( 10, 20));

        LambdaExpressionss d1 = () -> {
            System.out.println("Hello Printing Something!!"); };
        d1.printSomething();

        //Arrays
        List<Integer> test1 = List.of(91,27,13,43);
        for(int i:test1)
            System.out.println("Testing Array:::: " + i);

        System.out.println("Printing square of a list using Lambda::");
        SquareOfInput t = (List<Integer> inputList) -> {
            List<Integer> outputList= inputList.stream().map(p -> p *p).collect(Collectors.toList());
            return outputList;
        };
    }
}

class DateTimeExample {
    void getAllDates() {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        now = now.plusDays(20);
        System.out.println(now);

        LocalDateTime dateTime = LocalDateTime.MAX;
        System.out.println(dateTime);
        dateTime = LocalDateTime.of(2022, Month.SEPTEMBER, 10, 10, 10);
        System.out.println(dateTime);

        Period p = Period.between(now, dateTime.toLocalDate());
        System.out.println("Period.between = " + p);


    }

}

interface LambdaExpressionss {
    //public int getAddition(int x, int y);
    //public void printSomething(); Can have only 1 abstract method to do implementation as ->
    void printSomething();
}

interface SquareOfInput {
    List<Integer> squareOfInp(List<Integer> inputList);
}