import java.util.Scanner;

public class Stack {
    int n = 10;
    int top = -1;
    int a[] = new int[n];

    public void push(Scanner sc) {
        if (top == (n - 1)) {
            System.out.println("The Stack is full.");
        } else {
            System.out.println("Enter the data in the Stack: ");
            int data = sc.nextInt();
            top++;
            a[top] = data;
            System.out.println("Data has been inserted.");

        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("The STack is empty.");
        } else {
            top--;
            System.out.println("The data has been deleted.");
        }
    }

    public void display() {
        System.out.println("The data in the Stack are: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
