import java.util.Scanner;

public class CircularQueue_Using_Arrays {
    public static void main(String[] args) {
        int answer;
        int loop;
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();

        do {
            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to enqueue data.");
            System.out.println("Press 2 to dequeue data.");
            System.out.println("Press 3 to display the data in the Queue.");

            answer = sc.nextInt();

            switch (answer) {
                case 1:
                    q.enqueue(sc);
                    break;
                case 2:
                    q.dequeue();

                    System.out.println("Data has been dequeued.");

                    break;
                case 3:
                    q.display();
                    break;
            }
            System.out.println("Enter 0 to return to the main menu: ");
            System.out.println("Press any key to exit the program.");
            loop = sc.nextInt();

        } while (loop == 0);
        System.out.println("Program exited.");
    }
}
