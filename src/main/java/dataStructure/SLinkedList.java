package dataStructure;

public class SLinkedList {
    class Node {
        int item;
        Node next;

        Node(int element, Node next) {
            this.item = element;
            this.next = next;
        }
    }

    Node first;
    int size;

    public int getFirst() {
        final Node f = first;
        if (f == null) {
            throw new RuntimeException("ListEmpty");
        }
        return f.item;
    }

    public void addFirst(int e) {
        final Node f = first;
        final Node newNode = new Node(e, f);
        first = newNode;
        size++;
    }

    public int removeFirst() {
        final Node f = first;
        if (f == null) {
            throw new RuntimeException("ListEmpty");
        }
        final int element = f.item;
        final Node next = f.next;
        first = next;
        size--;
        return element;
    }
}
