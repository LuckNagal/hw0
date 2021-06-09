import Practice.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeTests {

    Practice solution;

    @Before
    public void init() {
        solution = new Practice();
    }

    @Test
    public void testRunningSum() {
        int[] input = new int[]{1, 3, 5, 7};
        int[] expected = new int[]{1, 4, 9, 16};
        Assert.assertArrayEquals(expected, solution.runningSum(input));

        input = new int[]{3,1,2,10,1};
        expected = new int[]{3,4,6,16,17};
        Assert.assertArrayEquals(expected, solution.runningSum(input));
    }

    @Test
    public void testCandies() {
        int[] inputArray = new int[]{2,3,5,1,3};
        int input = 3;
        ArrayList<Boolean> expected = new ArrayList<>();
        expected.add(true);
        expected.add(true);
        expected.add(true);
        expected.add(false);
        expected.add(true);
        Assert.assertEquals(expected, solution.kidsWithCandies(inputArray, input));

        inputArray = new int[]{4,2,1,1,2};
        input = 1;
        expected.set(1, false);
        expected.set(2, false);
        expected.set(4, false);
        Assert.assertEquals(expected, solution.kidsWithCandies(inputArray, input));
    }

    @Test
    public void testWealth() {
        int[][] input = new int[2][3];
        input[0] = new int[]{1, 2, 3};
        input[1] = new int[]{3, 2, 1};
        int expected = 6;
        Assert.assertEquals(expected, solution.maximumWealth(input));

        input = new int[3][2];
        input[0] = new int[]{1, 5};
        input[1] = new int[]{7, 3};
        input[2] = new int[]{3, 5};
        expected = 10;
        Assert.assertEquals(expected, solution.maximumWealth(input));
    }

    @Test
    public void testAltitude() {
        int[] input = new int[]{-5,1,5,0,-7};
        int expected = 1;
        Assert.assertEquals(expected, solution.largestAltitude(input));

        input = new int[]{-4,-3,-2,-1,4,3,2};
        expected = 0;
        Assert.assertEquals(expected, solution.largestAltitude(input));
    }
}
