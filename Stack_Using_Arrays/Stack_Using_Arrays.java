import java.util.Scanner;

public class Stack_Using_Arrays {
    public static void main(String[] args) {
        int answer;
        int loop;
        Scanner sc = new Scanner(System.in);
        Stack s1 = new Stack();

        do {
            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to push data.");
            System.out.println("Press 2 to pop data.");
            System.out.println("Press 3 to display the data in the Stack.");

            answer = sc.nextInt();

            switch (answer) {
                case 1:
                    s1.push(sc);
                    break;
                case 2:
                    s1.pop();

                    System.out.println("Data has been popped.");

                    break;
                case 3:
                    s1.display();
                    break;
            }
            System.out.println("Enter 0 to return to the main menu: ");
            System.out.println("Press any key to exit the program.");
            loop = sc.nextInt();

        } while (loop == 0);
        System.out.println("Program exited.");
    }
}
