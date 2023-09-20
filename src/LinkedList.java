public class LinkedList {
    private Node head;
    private int length;

    public LinkedList() {
        this.head = null;
        this.length = 0;
    }

    public LinkedList(Node head, int length) {
        this.head = head;
        this.length = length;
    }
    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void transverse() {
        Node current = head;

        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (length == 0) {
            head = newNode;
            length += 1;
            return;
        }

        newNode.setNext(head);
        head = newNode;
        length += 1;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (length == 0) {
            head = newNode;
            length += 1;
            return;
        }

        Node current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
        length += 1;
    }

    public void insertAtIndex(int data) {

    }

}
