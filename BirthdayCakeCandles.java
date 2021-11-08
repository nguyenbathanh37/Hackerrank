import java.util.*;
public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
            int max = candles.get(0), count = 0;
            for(int i : candles){
                if(i > max)
                    max = i;
            }
            for(int i : candles){
                if(i == max)
                    count++;
            }
            return count;
        }
}
