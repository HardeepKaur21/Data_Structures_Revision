import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        int n, i, j, a[], temp;

        System.out.println("How many elements do you want to enter?");

        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            a = new int[n];

            System.out.println("Enter elements: ");

            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (i = 1; i < n - 1; i++) {
                temp = a[i];
                j = i - 1;
                while (temp < a[j] && j > -1) {
                    a[j + 1] = a[j];
                    j = j - 1;
                }
                a[j + 1] = temp;
            }

            for (i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}