import java.util.*;

public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int i = 0, j = s.length() - 1;
        boolean check = true;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                check = false;
                break;
            }
            i++;
            j--;
        }

        if (check) {
            System.out.println("its a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
