import java.util.LinkedList;

public class LinkedList_Implementation {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(1, 12); // 4 is the index and 12 is the data

        PersonalLinkedList_Implementation list1 = new PersonalLinkedList_Implementation();

        list1.insert(5);
        list1.insert(10);
        list1.insert(20);

        list1.insertAtStart(0);

        list1.insertAt(3, 15);

        list1.insertAt(3, 12);

        list1.show();

        System.out.println();

        list1.deleteAt(3);
        list1.show();

    }
}
