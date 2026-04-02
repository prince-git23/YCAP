import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int vowels = 0, consonant = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                char ch2 = Character.toLowerCase(ch);
                if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u') {
                    vowels++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonant = " + consonant);
    }
}
