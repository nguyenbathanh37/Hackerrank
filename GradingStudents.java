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

/*HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's grade according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.*/