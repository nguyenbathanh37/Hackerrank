import java.util.*;
public class CompareTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
            int x = 0, y = 0;
            for(int i = 0; i < a.size(); i++){
                if(a.get(i) < b.get(i))
                    y++;
                if(a.get(i) > b.get(i))
                    x++;
            }
            List<Integer> c = new ArrayList<Integer>();
            c.add(x);
            c.add(y);
            return c;
        }
}
