public class Node {
    private int data;
    private Node previous;

    public Node(int data){
        this.data = data;
        this.previous = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node next) {
        this.previous = next;
    }
}
