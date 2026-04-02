import java.util.*;

public class hackerrankarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        int addition = 0;

        for (int i = 0; i < size; i++) {
            addition = addition + a[i];
        }

        System.out.println(addition);
    }
}
