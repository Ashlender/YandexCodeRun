import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int A,B,C,D,E;
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        D = in.nextInt();
        E = in.nextInt();

        if ((A <= D && B <= E) || (A <= E && B <= D) || (A <= D && C <= E) || (A <= E && C <= D)
                || (B <= D && C <= E) || (B <= E && C <= D)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
