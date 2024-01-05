import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int one = Integer.parseInt(in.nextLine());
        int two = Integer.parseInt(in.nextLine());
        int three = Integer.parseInt(in.nextLine());
        String answer = "NO SOLUTION";

        if(three >= 0){
            if(one == 0 && three*three == two){
                answer = "MANY SOLUTIONS";
            }else{
                double x = (three*three - two)*1.0/one;
                if(x%1==0){
                    answer = ((int) x) + "";
                }
            }
        }
        System.out.println(answer);
    }
}
