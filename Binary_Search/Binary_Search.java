import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        int n, i, item, counter = 0;
        int beg = 0, end = 0, mid = 0;
        int[] a;

        System.out.println("How many elements do you want to enter? ");

        try (Scanner sc = new Scanner(System.in)) {

            n = sc.nextInt();
            a = new int[n];

            System.out.println("Now, enter the data: ");

            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("Enter item to find:");
            item = sc.nextInt();
            sc.close();

            while (beg <= end) {
                mid = (beg + end) / 2;
                if (item == a[mid]) {
                    counter++;
                    break;
                } else if (item > a[mid]) {
                    beg = mid + 1;
                } else if (item < a[mid]) {
                    end = mid = 1;
                }
            }

            if (counter > 0) {
                System.out.println("Item found at " + mid);
            } else {
                System.err.println("Item not found.");
            }

        }
    }

}
