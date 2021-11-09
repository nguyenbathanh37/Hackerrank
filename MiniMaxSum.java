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
/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
Then print the respective minimum and maximum values as a single line of two space-separated long integers.*/