import java.util.Scanner;

public class DoublyLinkedList {

    Node head = null;
    Node tail = null;
    int answer = 1;

    public void creation() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a value: ");
            int data = sc.nextInt();

            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {
                head.prev = new_node;
                new_node.next = head;
                head = new_node;
            }

            System.out.println("Do you want to add more data?");
            System.out.println(
                    "If yes, press 1 to enter data as the header. Press 2, to enter data at the end of the list. Press 3 to enter the data at a specific index.");
            answer = sc.nextInt();

            switch (answer) {
                case 1:
                    new_node.next = head;
                    head.prev = new_node;
                    head = new_node;
                    break;

                case 2:
                    tail.next = new_node;
                    new_node.prev = tail;
                    tail = new_node;
                    break;

                case 3:
                    Node temp1 = head;
                    Node ptr = temp1.next;
                    System.out.println("Enter the specific position: ");
                    int p = sc.nextInt();

                    for (int i = 1; i < p - 1; i++) {
                        temp1 = ptr;
                        ptr = ptr.next;
                    }
                    new_node.prev = temp1;
                    new_node.next = ptr;
                    temp1.next = new_node;
                    ptr.prev = new_node;
                    break;
            }
            sc.close();
        } while (answer == 1);
    }

    public void traverse() {
        Node temp = head;
        if (head == null) { // means the linkedlist does not exist
            System.out.println("The Linkedlist is empty.");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("The list is empty");
            } else {
                System.out.println(
                        "Press 1 to delete data from the start. Press 2, to delete data at the end of the list. Press 3 to delete data at a specific index.");
                answer = sc.nextInt();

                switch (answer) {
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        head.prev = null;
                        break;

                    case 2:
                        Node temp1 = tail;
                        temp1 = temp1.prev;
                        temp1.next = null;
                        break;

                    case 3:
                        System.out.println("Enter the specific position: ");
                        int p = sc.nextInt();

                        Node temp2 = head;
                        Node ptr1 = temp2.next;

                        for (int i = 0; i < p - 1; i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;
                        ptr1.next.prev = temp2;
                        break;
                }

            }

            System.out.println("Do you want to delete more data?");
            answer = sc.nextInt();

            sc.close();
        } while (answer == 1);
    }
}
