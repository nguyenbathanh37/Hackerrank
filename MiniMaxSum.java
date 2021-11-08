import java.util.*;
public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
            long min = arr.get(0), max = arr.get(0);
            long sum = 0;
            for(long i : arr){
                if(i < min)
                    min = i;
                if(i > max)
                    max = i;
                sum += i;
            }
            System.out.println((sum - max) + " " + (sum - min));
        }
}
