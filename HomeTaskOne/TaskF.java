import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {

     Scanner in = new Scanner(System.in);

     int a = in.nextInt();
     int b = in.nextInt();
     int c = in.nextInt();
     int d = in.nextInt();

     int resA = Math.max(a, c) * (b + d);
     int resB = Math.max(a, d) * (b + c);
     int resC = Math.max(b, c) * (a + d);
     int resD = Math.max(b, d) * (a + c);

        if (resA < resB && resA < resC && resA < resD) {
            System.out.println(Math.max(a, c) + " " + (b + d));
        } else if (resB < resC && resB < resD) {
            System.out.println(Math.max(a, d) + " " + (b + c));
        } else if (resC < resD) {
            System.out.println(Math.max(b, c) + " " + (a + d));
        } else {
            System.out.println(Math.max(b, d) + " " + (a + c));
        }
    }
}