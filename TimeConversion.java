public class TimeConversion {
    public static String timeConversion(String s) {
        // Write your code here
            String[] t = s.split(":");
            if(t[2].charAt(2) == 'P'){
                if(t[0].equals("12") == false){
                        int i = Integer.parseInt(t[0]) + 12;
                        t[0] = String.valueOf(i);
                    }
                    t[2] = t[2].replace("PM","");
            }
            else{
                if(t[0].equals("12")){
                    t[0] = "00";
                }
                t[2] = t[2].replace("AM","");
            }
            String t2 = String.join(":", t[0], t[1], t[2]);
            return t2;
        }    
}
