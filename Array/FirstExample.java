public class FirstExample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nUsing while loop");
        int i = 0;
        while (i < 5) {
            System.out.print(a[i]);
            i++;
        }

        System.out.println("\nDO while loop");
        int j = 0;
        do {
            System.out.print(a[j]);
            j++;
        } while (j < 5);
    }
}
