package Practice;

import java.util.ArrayList;

public class Practice {
    /* These are a few practice questions that involve working with Arrays and ArrayLists.
     * You can work on this part even if you did not finish the Arrays and ArrayLists
     * implementation from Part 1.
     */

    public int[] runningSum(int[] input) {
        /* Return the running sum of inputs.
         * Input: [1, 3, 5, 7]
         * Output: [1, 4, 9, 16]
         */

        // YOUR CODE HERE
        int[] output = new int[input.length];
        int sum = 0;
        for (int i = 0; i < input.length; i++){
            sum += input[i];
            output[i] = sum;
        }

        return output;
    }

    public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        /* Given the array candies and the integer extraCandies, where candies[i] represents the number of candies
        that the ith kid has. For each kid check if there is a way to distribute extraCandies among the kids such
        that he or she can have the greatest number of candies among them. Notice that multiple kids can have the
        greatest number of candies.

        Input: candies = [2,3,5,1,3], extraCandies = 3
        Output: [true,true,true,false,true]
        Explanation:
        Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number of candies among the kids.
        Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
        Kid 3 has 5 candies and this is already the greatest number of candies among the kids.
        Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies.
        Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.

        Input: candies = [4,2,1,1,2], extraCandies = 1
        Output: [true,false,false,false,false]
        Explanation: There is only 1 extra candy, therefore only kid 1 will have the greatest number of candies among the kids regardless of who takes the extra candy.
         */

        // YOUR CODE HERE
        ArrayList<Boolean> booleanList = new ArrayList<Boolean>();
//        for (int i; candies){
//
//        }

        return booleanList;
    }

    public int maximumWealth(int[][] accounts) {
        /* You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer
        has in the jth bank. Return the wealth that the richest customer has. A customer's wealth is the amount of money
        they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

        Input: accounts = [[1,2,3],[3,2,1]]
        Output: 6
        Explanation:
        1st customer has wealth = 1 + 2 + 3 = 6
        2nd customer has wealth = 3 + 2 + 1 = 6
        Both customers are considered the richest with a wealth of 6 each, so return 6.

        Input: accounts = [[1,5],[7,3],[3,5]]
        Output: 10
        Explanation:
        1st customer has wealth = 6
        2nd customer has wealth = 10
        3rd customer has wealth = 8
        The 2nd customer is the richest with a wealth of 10.
        */

        // YOUR CODE HERE

        return 0;
    }

    public int largestAltitude(int[] gain) {
        /* There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
        The biker starts his trip on point 0 with altitude equal 0. You are given an integer array gain of length n
        where gain[i] is the net gain in altitude between points i and i + 1 for
        all (0 <= i < n). Return the highest altitude of a point.

        Input: gain = [-5,1,5,0,-7]
        Output: 1
        Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

        Input: gain = [-4,-3,-2,-1,4,3,2]
        Output: 0
        Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.

        HINT: This question should seem very familiar to one of the above questions. Try to
        use one of the functions above to write a quick and easy solution to this one.
         */

        // YOUR CODE HERE

        return 0;
    }

}
