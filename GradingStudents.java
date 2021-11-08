import java.util.*;
public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
            List<Integer> list = new ArrayList<Integer>();
            for(int i : grades){
                if(i < 35){
                    list.add(i);
                }
                else if(i%10 == 4 || i%10 == 9){
                    list.add(i+1);
                }
                else if(i%10 == 3 || i%10 == 8){
                    list.add(i+2);
                }
                else{
                    list.add(i);
                }
            }
            return list;
        }
    
}
