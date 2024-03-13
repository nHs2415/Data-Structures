import java.util.NoSuchElementException;

public class Stack {
    private Node top;
    private int length = 0;

    public Stack(){
        this.top = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.setPrevious(top);//newNode = newNode.previous;
        this.top = newNode;
        length++;
    }

    public int pop(){
        int poppedVal = top.getData();
        if (top == null){
            throw new NoSuchElementException("Stack is Empty");
        }
        this.top = top.getPrevious();
        length--;
        return poppedVal;
    }

    public void peek(){
        if (top == null){
            System.out.println("Stack is Empty");
        }
        System.out.println("Top : "+top.getData());
    }

    public void printStack(){

        if (top == null){
            System.out.println("Empty stack");
        }
        Node temp = top;
        while (temp != null){
            System.out.print(temp.getData() + " --> ");
            temp = temp.getPrevious();
        }
        System.out.println("null");

    }
}
