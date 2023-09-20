public class Node {
    private int data;
    private Node next;

    // Default constructor
    public Node() {
        this.next =  null;
    }

    public Node(int data) {
        this.data = data;
        this.next =  null;
    }

    // Parameterized constructor
    public Node(int data, Node node) {
        this.data = data;
        this.next = node;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
