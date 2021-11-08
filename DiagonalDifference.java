import java.util.*;
public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
            int n = arr.size() - 1, sum1 = 0, sum2 = 0;
            for(int i = 0; i < arr.size(); i++){
                sum1 += arr.get(i).get(i);
                sum2 += arr.get(i).get(n-i);
            }
            return Math.abs(sum1 - sum2);
        }
}
