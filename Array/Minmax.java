public class Minmax {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        int min = a[4];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            if (min > a[i]) {
                min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
        }

        System.out.println("max value = " + max);
        System.out.println("min value = " + min);
    }
}
