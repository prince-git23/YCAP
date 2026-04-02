public class sumofarray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int addition = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
            addition = addition + a[i];
        }

        System.out.println("Addition = " + addition);
    }
}
