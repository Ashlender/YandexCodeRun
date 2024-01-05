import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String mode = in.nextLine();

        Scanner numb = new Scanner(input);

        int troom = numb.nextInt();
        int tcond = numb.nextInt();

        switch (mode) {
            case "heat":
                System.out.print(Math.max(troom, tcond));
                break;
            case "freeze":
                System.out.print(Math.min(troom, tcond));
                break;
            case "auto":
                System.out.print(tcond);
                break;
            case "fan":
                System.out.print(troom);
                break;
        }
    }
}