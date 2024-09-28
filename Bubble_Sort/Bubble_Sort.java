import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        int n = 0, i, k, a[], temp;

        System.out.println("How many elements do you want to enter?");

        try (Scanner sc = new Scanner(System.in)) {

            n = sc.nextInt();
            a = new int[n];

            System.out.println("Enter elements: ");

            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (i = 0; i < n - 1; i++) {
                for (k = 0; k < n - i - 1; k++) {
                    if (a[k] > a[k + 1]) {
                        temp = a[k];
                        a[k] = a[k + 1];
                        a[k + 1] = temp;
                    }
                }
            }

            for (i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}