package Labor_8.Stack;

import java.util.ArrayList;

public class Stack_Aggregation {

    private ArrayList<Object> items;
    private final  int capacity;

    public Stack_Aggregation(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(this.capacity);
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public boolean isFull(){
        return items.size() == this.capacity;
    }

    public void push(Object o) {
        if(!isFull())
            items.add(o);
    }

    public Object pop() {
        if(!isEmpty()) {
            Object o = items.get(items.size() - 1);
            items.remove(items.size() - 1);

            return o;
        }
        return null;
    }

    public Object top() {
        if(!isEmpty())
            return items.get(items.size() - 1);
        return null;
    }

    public int getSize() {
        return items.size();
    }
}
