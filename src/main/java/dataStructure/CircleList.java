package dataStructure;

public class CircleList {
    class CNode {
        int item;
        CNode next;

        CNode(int element, CNode next) {
            this.item = element;
            this.next = next;
        }
    }

    CNode cursor;

    CircleList() {

    }

    boolean empty() {
        return cursor == null;
    }

    int back() {

        if (empty()) {
            throw new RuntimeException("ListEmpty");
        }
        CNode b = cursor;
        return b.item;
    }

    int front() {
        if (empty()) {
            throw new RuntimeException("ListEmpty");
        }
        CNode f = cursor.next;
        return f.item;
    }

    void advance() {
        if (empty()) {
            throw new RuntimeException("ListEmpty");
        }
        cursor = cursor.next;
    }

    void add(int e) {
        CNode v = new CNode(e, null);
        if (cursor == null) {
            v.next = v;
            cursor = v;
        } else {
            v.next = cursor.next;
            cursor.next = v;
        }
    }
    
    void remove() {
        CNode old = cursor.next;
        if (old == cursor) {
            cursor = null;
        } else {
            cursor.next = old.next;
        }
    }
}
