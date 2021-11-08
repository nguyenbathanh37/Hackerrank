import java.util.*;
public class CountApplesAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
            int counta = 0, counto = 0;
            for(int i : apples){
                if(a+i <= t && a+i >= s)
                    counta++;
            }
            for(int i : oranges){
                if(b+i <= t && b+i >= s)
                    counto++;
            }
            System.out.println(counta);
            System.out.println(counto);
        }
}
