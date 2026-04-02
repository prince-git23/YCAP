import java.util.*;

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        int i = 0, j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("Reverse string = " + new String(arr));
    }
}
