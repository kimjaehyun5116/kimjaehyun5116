package fc.java.course2.part2;

import fc.java.model2.AverageCalculator;

import java.util.ArrayList;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};

        AverageCalculator<Integer> integerCalculator = new AverageCalculator<>(integers);
        double integerAverage = integerCalculator.calculateAverage();
        System.out.println(integerAverage); // 3.0

        AverageCalculator<Double> doubleCalculator = new AverageCalculator<>(doubles);
        double doubleAverage = integerCalculator.calculateAverage();
        System.out.println(integerAverage); // 3.0
    }
}
