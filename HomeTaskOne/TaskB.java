import java.util.Scanner;
public class TaskB {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        if((x+y)>z && (x+z)>y && (z+y>x)) {
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
