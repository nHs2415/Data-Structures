import java.util.NoSuchElementException;

public class Queue {
    private Node front;
    private Node rear;
    private int length = 0;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public int length(){
        System.out.println("Length : "+length);
        return length;
    }

    public boolean isEmpty(){
        //return length == 0;
        if(this.front == null){
            return true;
        }
        return false;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            this.front = newNode;
        }else {
            this.rear.setNext(newNode);
        }
        this.rear = newNode;

        length++;
    }

    public int deQueue(){
         if (isEmpty()){
             throw new NoSuchElementException("Queue is already empty");
         }

        int deletedVal = this.front.getData();

         this.front=this.front.getNext(); //front = front.next

         if (this.front == null){
             this.rear = null;
         }
         length --;
         return deletedVal;
    }

    public void peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is already empty");
        }else {
            System.out.println("Front = "+front.getData()); //front.data
        }
    }

    public void print(){
        if(this.front==null){
            System.out.println("queue is null");
        }
        Node temp=this.front;
        while(temp!=null){
            System.out.print(temp.getData()+"-->");
            temp=temp.getNext();
        }
        System.out.println("null");
    }



}
