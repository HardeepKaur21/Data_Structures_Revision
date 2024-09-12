import java.util.*; //this is how you import the collection framework in your java file

public class Collection_Frames {
    public static void main(String[] args) {

        // ArrayList
        // -----------------------------------------------------------------------

        /*
         * // This applies for LinkedLists too
         * // LinkedList<Integer> c1 = new LinkedList<Integer>(); //this is how to
         * declare
         * // a linkedlist
         */

        List<Integer> c = new ArrayList<Integer>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        System.out.println(c);

        c.remove(2);
        System.out.println(c);

        System.out.println(c.get(3)); // get data from a particular index

        c.set(1, 90); // this will update the data at index 1 from 20 to 90
        System.out.println(c);

        System.out.println(c.contains(100)); // this returns true/false if the array contains 100 or not

        c.clear(); // this will empty the list
        System.out.println(c);

        // Stack
        // ----------------------------------------------------------------------------
        Stack<Integer> s = new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("\nThe stack is: " + s);

        System.out.println("The top element of the stack is: " + s.peek()); // this will return the top value

        s.pop();

        System.out.println("The stack is: " + s);

        s.search(20); // this will return the position of the element we are searching

        s.isEmpty(); // returns true or false in case the stack is empty

        // Queue
        // --------------------------------------------------------------------------------------------
        Queue<Integer> q = new LinkedList<Integer>();

        // enqueue
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println("\nThe queue is: " + q); // this will return 10 cause it is the first int

        // dequeue
        q.poll(); // deletes data at the front
        System.out.println("The queue is (after dequeuing): " + q);

        // Priority Queue
        // --------------------------------------------------------------------------------------------

        // implements min heap
        Queue<Integer> pq = new PriorityQueue<Integer>();

        // enqueue
        pq.offer(10);
        pq.offer(2);
        pq.offer(35);
        pq.offer(400);
        pq.offer(59);

        System.out.println("\nThe priority queue is: " + pq);

        // dequeue
        q.poll(); // deletes data with least priority

        System.out.println("The priority queue is: " + pq);

        // implements max heap
        Queue<Integer> pqReverse = new PriorityQueue<Integer>(Comparator.reverseOrder());

        // enqueue
        pqReverse.offer(10);
        pqReverse.offer(20);
        pqReverse.offer(30);
        pqReverse.offer(40);
        pqReverse.offer(50);

        System.out.println("The reverse priority queue is: " + pqReverse);

        // HashSets (does not allow duplicate values)
        // --------------------------------------------------------------------------------------------

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(200);
        set.add(0);
        set.add(345);

        System.out.println("\nThe hash set is: " + set);

        set.remove(0); // this will remove zero
        System.out.println("The hash set is now: " + set);

        set.clear(); // this will clear the set
        System.out.println("The hash set is now: " + set);

        set.size(); // this will return the size of the set

        set.contains(70); // this will check if 70 is in the hash set

        // LinkedHashSets
        // --------------------------------------------------------------------------------------------
        Set<Integer> lset = new LinkedHashSet<>();
        lset.add(10);
        lset.add(0);
        lset.add(340);
        lset.add(98);
        lset.add(10); // sets cannot have duplicate data

        System.out.println("\nThe linked hash set is: " + lset); // the data is printed way we inserted it

        // TreeSets
        // --------------------------------------------------------------------------------------------

        Set<Integer> tree = new TreeSet<Integer>(); // set and a binary search tree

        tree.add(10);
        tree.add(0);
        tree.add(340);
        tree.add(98);
        tree.add(10);

        System.out.println("\nThe tree set is: " + tree); // the data is added in a sorted format

        // HashMap
        // --------------------------------------------------------------------------------------------

        Map<Integer, String> map = new HashMap<>(); // 2 data types declared one for the data and the other for the keys

        // 1: "Hardeep", 4: "AnAstroStudent" cannot have duplicate keys

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(3, "hellooooooo"); // the previous data for this key will be overwritten

        map.putIfAbsent(3, "byeeeee"); // this will not overwite the hi above

        System.out.println("\nThe hashmap is: " + map);
        System.out.println(map.isEmpty()); // returns boolean
        System.out.println(map.remove(3) + " was deleted"); // data with key will be deleted

        // this will print the keys only
        for (Integer i : map.keySet()) {
            System.out.print(i + " ");
        }
        System.out.println();

        // this will print the values only
        for (String str : map.values()) {
            System.out.print(str + " ");
        }

        // TreeMap
        // --------------------------------------------------------------------------------------------
        Map<Integer, String> treemap = new TreeMap<>(); // tree and a map

        // the data can be entered in a unsorted format but will be sorted while adding
        // to the structure
        treemap.put(5, "A");
        treemap.put(4, "B");
        treemap.put(2, "C");
        treemap.put(3, "D");
        treemap.put(1, "E");

        System.out.println("\nThe tree map is: " + treemap); // everything else the same as a hashmap

        // Lisiterators, these are used to traverse a list
        // --------------------------------------------------------------------------------------------
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // ListIterator is the interface and .listIterator is the class of the iterator
        ListIterator<Integer> iter = list.listIterator();

        System.out.println("\nListIterator: ");

        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

        System.out.println();

        while (iter.hasPrevious()) {
            System.out.print(iter.previous() + " ");
        }

    }
}