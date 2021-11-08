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
