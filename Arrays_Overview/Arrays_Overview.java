/* This code is written on arrays, but it is not just an average overview of arrays.

In this code i explore the way data can be inserted on an already full array.

Arrays are known to be of fixed size, so this code explores a way to make them a bit more dynamic 

By creating a second array of 1 more size and copy and pasting the data in the manner required.

In this array you can:
- insert a new value (and increase the size of the array)
- delete a value (and reduce the size of the array)

*/

import java.util.Scanner;

public class Arrays_Overview {

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");

        n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n + 1];

        System.out.println("Now enter the values of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Insert the index where to add a new value: ");
        int m = sc.nextInt();

        System.out.println("Insert the new value: ");
        int newValue = sc.nextInt();
        sc.close();

        for (int i = 0; i < n + 1; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                b[i] = newValue;
            } else {
                b[i] = a[i - 1];
            }
        }

        System.out.println("The values you entered are: ");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(b[i]);
        }

        System.out.println("Enter the index of the value you want to delete: ");
        int deleteIndex = sc.nextInt();

        for (int i = 0; i < n + 1; i++) {
            if (i < deleteIndex) {
                b[i] = a[i];
            } else if (i == deleteIndex) {
                continue;
            } else {
                b[i - 1] = a[i];
            }

        }

        System.out.println("The values remaining are: ");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(b[i]);
        }
    }
}