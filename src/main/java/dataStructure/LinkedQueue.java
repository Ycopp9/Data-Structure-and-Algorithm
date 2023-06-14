package dataStructure;

public class LinkedQueue {
    CircleList C;
    int n;
    
    LinkedQueue() {
    }

    int front() {
        if (empty()) {
            throw new RuntimeException("QueueEmpty");
        }
        return C.front();
    }

    int dequeue() {
        if (empty()) {
            throw new RuntimeException("QueueEmpty");
        }
        int f = C.front();
        C.remove();
        n--;
        return f;
    }

    void enqueue(int e) {
        C.add(e);
        C.advance();
        n++;
    }

    int size() {
        return n;
    }

    boolean empty() {
        return n == 0;
    }
}
