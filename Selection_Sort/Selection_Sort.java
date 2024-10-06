import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        int n, i, j, a[], temp, loc;

        System.out.println("How many elements do you want to enter?");

        try (Scanner sc = new Scanner(System.in)) {

            n = sc.nextInt();
            a = new int[n];

            System.out.println("Enter the elements: ");

            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();

            }
            sc.close();
        }

        for (i = 0; i < n - 1; i++) {
            loc = i;
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[loc]) {
                    loc = j;
                }
            }
            temp = a[i];
            a[i] = a[loc];
            a[loc] = temp;

        }

        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}