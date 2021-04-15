package lab8_2;

import java.util.ArrayList;

public class StackAggregation {

    private final ArrayList<Object> items;
    private final int capacity;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(this.capacity);
    }

    public boolean isFull() {
        return this.getSize() == this.capacity;
    }

    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    public void push(Object o) {
        if (!this.isFull())
            this.items.add(o);
    }

    public Object pop() {
        if (!this.isEmpty()) {
            Object o = this.items.get(this.getSize() - 1);
            this.items.remove(this.getSize() - 1);
            return o;
        }

        return null;
    }

    public Object top() {
        if (!this.isEmpty())
            return this.items.get(this.getSize() - 1);
        return null;
    }

    public int getSize() {
        return this.items.size();
    }

}
