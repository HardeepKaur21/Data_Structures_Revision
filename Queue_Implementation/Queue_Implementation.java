public class Queue_Implementation {
    public static void main(String[] args) {
        Queue q1 = new Queue();

        q1.enQueue(0);
        q1.enQueue(1);

        q1.show();

        System.out.println("\nAfter deQueueing: ");

        q1.deQueue();
        q1.show();

        System.out.println("\nAdd more values: ");
        q1.enQueue(1);
        q1.enQueue(2);
        q1.enQueue(3);
        q1.enQueue(4);
        q1.show();
    }
}
