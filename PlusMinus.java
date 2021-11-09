import java.util.*;
public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
            int n = arr.size(), pos = 0, neg = 0, zero = 0;
            for(int i : arr){
                if(i < 0)
                    neg++;
                else if(i > 0)
                    pos++;
                else zero++;
            }
            System.out.println((double)pos/n);
            System.out.println((double)neg/n);
            System.out.println((double)zero/n);
        }
}
/*Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
 Print the decimal value of each fraction on a new line with 6 places after the decimal.*/