import java.util.*;
public class RotateLeft {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
            List<Integer> p = new ArrayList<Integer>();
            for(int i = d; i < arr.size(); i++){
                p.add(arr.get(i));
            }
            for(int i = 0; i < d; i++){
                p.add(arr.get(i));
            }
            return p;
        }
}
