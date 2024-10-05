import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        int n, i, a[];

        System.out.println("How many elements do you want to enter?");

        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            a = new int[n];

            System.out.println("Enter the elements: ");

            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            QuickSort qs = new QuickSort();
            qs.quick(a, 0, n - 1);

            for (i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }

        }

    }
}