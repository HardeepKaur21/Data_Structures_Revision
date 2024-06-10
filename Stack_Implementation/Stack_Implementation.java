
public class Stack_Implementation {
    public static void main(String[] args) {
        Stack s1 = new Stack();

        System.out.println("Is the stack empty? " + s1.isEmpty());

        s1.push(0);
        s1.push(5);
        s1.push(10);

        s1.show();

        System.out.println("Popped value: " + s1.pop());

        s1.show();

        System.out.println("The size of the stack is: " + s1.size());

        System.out.println("Is the stack empty? " + s1.isEmpty());

        DynamicStack ds = new DynamicStack();

        System.out.println("Follwowing is the dynamic array:");

        ds.push(0);
        ds.push(1);
        ds.show();

        ds.push(2);
        ds.push(3);
        ds.show();

        ds.push(4);
        ds.push(5);
        ds.push(6);
        ds.push(7);
        ds.show();

        ds.push(8);
        ds.push(9);
        ds.show();

        System.out.println("Now let's try popping (the size should also be reduced):");

        ds.pop();
        ds.pop();
        ds.show();

        ds.pop();
        ds.pop();
        ds.pop();
        ds.pop();
        ds.show();

        ds.pop();
        ds.pop();
        ds.show();

    }
}