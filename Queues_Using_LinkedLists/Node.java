public class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) { // used to define default values
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}