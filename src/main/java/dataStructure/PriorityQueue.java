package dataStructure;

public class PriorityQueue {
    int maxSize;
    int size;
    int[] element;

    PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        element = new int[maxSize];
        size = 0;
    }

    void insert(int e) {
        int i = size;
        if (i >= maxSize) {
            throw new RuntimeException("QueueFull");
        }
        siftUp(i, e);
        size = i + 1;
    }

    int extractMax() {
        if (isEmpty()) {
            throw new RuntimeException("QueueEmpty");
        }
        int result = element[0];
        int n;
        int x = element[(n = --size)];
        if (n > 0) {
            siftDown(0, x, n);
        }
        return result;
    }

    int max() {
        if (isEmpty()) {
            throw new RuntimeException("QueueEmpty");
        }
        return element[0];
    }

    boolean isEmpty() {
        return size == 0;
    }

    private void siftUp(int k, int x) {
        int key = x;
        while (k > 0) {
            int parent = (k - 1) >>> 1;
            int e = element[parent];
            if (key <= e) {
                break;
            }
            element[k] = e;
            k = parent;
        }
        element[k] = key;
    }

    private void siftDown(int k, int x, int n) {
        int key = x;
        int half = n >>> 1;
        while (k < half) {
            int child = (k << 1) + 1;
            int c = element[child];
            int right = child + 1;
            if (right < n && c < element[right]) {
                c = element[child = right];
            }
            if (key >= c) {
                break;
            }
            element[k] = c;
            k = child;
        }
        element[k] = key;
    }
}
