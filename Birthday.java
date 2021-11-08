import java.util.*;
public class Birthday {
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
            int count = 0;
            if(m == 1 && s.size()==1){
                if(s.get(0) == d){
                    return 1;
                }
                else return 0;
            }
            if(m>d){
                return 0;
            }
            else{
                for(int i = 0; i <= s.size()-m; i++){
                    int sum = 0;
                    for(int j = i; j < i+m; j++){
                        sum += s.get(j);
                    }
                    if(sum == d){
                        count++;
                    }
                }
            }
            return count;
        }
}
