package dataStructure;

public class ArrayStack {
    int[] S;
    int cnt;

    ArrayStack(int capacity) {
        S = new int[capacity];
    }

    void push(int e) {
        if (cnt == S.length) {
            throw new RuntimeException("StackFull");
        }
        S[cnt] = e;
        cnt++;
    }

    int pop() {
        if (cnt == 0) {
            throw new RuntimeException("StackEmpty");
        }
        int value = S[cnt - 1];
        cnt--;
        return value;
    }

    int top() {
        if (cnt == 0) {
            throw new RuntimeException("StackEmpty");
        }
        return S[cnt - 1];
    }

    int size() {
        return cnt;
    }

    boolean empty() {
        return cnt == 0;
    }
}
