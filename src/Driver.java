public class Driver {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(13);
        queue.deQueue();
        queue.enqueue(34);
        queue.enqueue(54);
        queue.print();

        queue.peek();
        queue.enqueue(56);
        queue.enqueue(67);
        queue.print();
        queue.peek();
        queue.deQueue();
        queue.peek();
        queue.length();
    }
}
