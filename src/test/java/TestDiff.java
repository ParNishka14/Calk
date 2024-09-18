import org.example.first_task.SetDifferenceCalculator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDiff {
    @Test
    void test1(){
        Set<Integer> numbers = Set.of(1,2,3,4,5,6,7,8);
        Set<Integer> expectedUniqueNumbers = Set.of(6,7,8);
        Set<Integer> a1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> actualUniqueNumbers = SetDifferenceCalculator.calculateDifference(numbers, a1);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
        System.out.println("Test 1 success");
    }

    @Test
    void test2(){
        Set<Integer> numbers = Set.of(55,22,623,73,0);
        Set<Integer> expectedUniqueNumbers = Set.of(22,623);
        Set<Integer> a1 = new HashSet<>(Arrays.asList(90,55,236,0,73));
        Set<Integer> actualUniqueNumbers = SetDifferenceCalculator.calculateDifference(numbers, a1);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
        System.out.println("Test 2 success");
    }

    @Test
    void test3(){
        Set<Integer> numbers = Set.of(0);
        Set<Integer> expectedUniqueNumbers = Set.of(0);
        Set<Integer> a1 = new HashSet<>(Arrays.asList());
        Set<Integer> actualUniqueNumbers = SetDifferenceCalculator.calculateDifference(numbers, a1);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
        System.out.println("Test 3 success");
    }

    @Test
    void test4(){
        Set<Integer> numbers = Set.of(110,12,752,98743,1974);
        Set<Integer> expectedUniqueNumbers = Set.of(752, 1974, 98743, 12, 110);
        Set<Integer> a1 = new HashSet<>(Arrays.asList(1,2,4,6,2,88,0));
        Set<Integer> actualUniqueNumbers = SetDifferenceCalculator.calculateDifference(numbers, a1);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
        System.out.println("Test 4 success");
    }

    @Test
    void test5(){
        Set<Integer> numbers = Set.of(110,12,752,98743,1974);
        Set<Integer> expectedUniqueNumbers = Set.of(752, 1974, 98743, 12, 110);
        Set<Integer> a1 = new HashSet<>(Arrays.asList(1,2,4,6,2,88,0));
        Set<Integer> actualUniqueNumbers = SetDifferenceCalculator.calculateDifference(numbers, a1);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
        System.out.println("Test 5 success");
    }
}
