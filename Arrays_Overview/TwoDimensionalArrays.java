/*Quick overview fo 2D arrays.
 * 
 * Just focuses on defining, filling, and prining a 2D array.
 * 
 */

import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        int a[][] = new int[rows][cols];

        System.out.println("Enter the values of the 2D array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

}
