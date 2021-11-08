public class Staircase {
    public static void staircase(int n) {
        // Write your code here
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    if(j <= n-i)
                        System.out.print(" ");
                    else System.out.print("#");
                }
                System.out.println();
            }
        }
}
