package dataStructure;

public class ArrayQueue {
    int[] Q;
    int n, f, r;

    ArrayQueue() {
        this(100);
    }

    ArrayQueue(int capacity) {
        Q = new int[capacity];
    }

    int front() {
        if (empty()) {
            throw new RuntimeException("QueueEmpty");
        }
        return Q[f];
    }

    int dequeue() {
        if (empty()) {
            throw new RuntimeException("QueueEmpty");
        }
        int value = Q[f];
        f = (f + 1) % Q.length;
        n = n - 1;
        return value;
    }

    void enqueue(int e) {
        if (size() == Q.length) {
            throw new RuntimeException("QueueFull");
        }
        Q[r] = e;
        r = (r + 1) % Q.length;
        n = n + 1;
    }

    int size() {
        return n;
    }

    boolean empty() {
        return n == 0;
    }
}
