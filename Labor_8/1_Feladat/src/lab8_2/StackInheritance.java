package lab8_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {
    private final int capacity;

    public StackInheritance(int capacity) {
        super();
        this.capacity = capacity;
    }

    public boolean isFull() {
        return this.getSize() == this.capacity;
    }

    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    public void push(Object o) {
        if(!this.isFull()) {
            super.add(o);
        }
    }

    public Object pop() {
        if(!this.isEmpty()) {
            Object o = super.get(this.getSize() - 1);
            super.remove(this.getSize() - 1);
            return o;
        }

        return null;
    }

    public Object top() {
        if(!this.isEmpty())
            return super.get(this.getSize() - 1);
        return null;
    }

    public int getSize() {
        return this.size();
    }
}
