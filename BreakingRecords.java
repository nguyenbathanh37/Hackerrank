import java.util.*;
public class BreakingRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
            List<Integer> c = new ArrayList<Integer>();
            int min = scores.get(0), max = scores.get(0);
            int cmin = 0, cmax = 0;
            for(int i : scores){
                if(i>max){
                    max = i;
                    cmax++;
                }
                else if(i < min){
                    min = i;
                    cmin++;
                }
            }
            c.add(cmax);
            c.add(cmin);
            return c;
        }
}
