package dataStructure;

public class LinkedStack {
    SLinkedList S;
    int cnt;

    LinkedStack() {
        S = new SLinkedList();
    }

    void push(int e) {
        S.addFirst(e);
        cnt++;
    }

    int pop() {
        if (cnt == 0) {
            throw new RuntimeException("StackEmpty");
        }
        int value = S.removeFirst();
        cnt--;
        return value;
    }

    int top() {
        if (cnt == 0) {
            throw new RuntimeException("StackEmpty");
        }
        return S.getFirst();
    }

    int size() {
        return cnt;
    }

    boolean empty() {
        return cnt == 0;
    }
}
