import java.util.Scanner;

public class TaskC {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String strOne = in.nextLine();
        String strTwo = in.nextLine();
        String strThree = in.nextLine();
        String strFour = in.nextLine();

        strOne = strOne.replaceAll("[^0-9+()]", "");
        strTwo = strTwo.replaceAll("[^0-9+()]", "");
        strThree = strThree.replaceAll("[^0-9+()]", "");
        strFour = strFour.replaceAll("[^0-9+()]", "");

        int len = strOne.length();
        String strSearch = strOne.substring(len-7);

        if (strTwo.contains(strSearch)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        if (strThree.contains(strSearch)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        if (strFour.contains(strSearch)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
