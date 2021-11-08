import java.util.*;
public class MatchingStrings {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
            List<Integer> list = new ArrayList<Integer>();
            for(String i : queries){
                int count = 0;
                for(String j : strings){
                    if(j.equals(i)){
                        count++;
                    }
                }
                list.add(count);
            }
            return list;
        }
}
