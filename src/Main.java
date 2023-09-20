// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        // for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
           //  System.out.println("i = " + i);
        // }

        Node myNode = new Node(14);
//        System.out.println("myNode next: " + myNode.getNext());

        Node anotherNode = new Node(13, myNode);
//        System.out.println("anotherNode data: " + anotherNode.getData());

        Node oneMoreNode = new Node(12, anotherNode);

//        LinkedList myLinkedList = new LinkedList(oneMoreNode, 3);

        LinkedList myLinkedList = new LinkedList();
        myLinkedList.insert(12);
        myLinkedList.insert(13);
        myLinkedList.insert(14);
        myLinkedList.insertEnd(11);
        myLinkedList.transverse();
    }
}