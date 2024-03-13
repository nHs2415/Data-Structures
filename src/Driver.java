public class Driver {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(23);
        s1.printStack();
        s1.peek();

        s1.push(34);
        //s1.printStack();
        s1.peek();
        s1.pop();
        s1.peek();
        s1.push(56);
        s1.printStack();
    }
}
