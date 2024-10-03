import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        int n, i, item, counter = 0;
        int[] a;

        System.out.println("How many elements do you want to enter? ");

        try (Scanner sc = new Scanner(System.in)) {
            ;
            n = sc.nextInt();
            a = new int[n];

            System.out.println("Now, enter the data: ");

            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("Enter item to find:");
            item = sc.nextInt();
            sc.close();

            for (i = 0; i < a.length; i++) {
                if (a[i] == item) {
                    counter++;
                    break;
                } else {
                    System.out.println("Item does not exist");
                }
            }

            if (counter > 0) {
                System.out.println("Item exists at" + i);
            } else {
                System.out.println("Item does not exist");
            }
        }
    }

}
