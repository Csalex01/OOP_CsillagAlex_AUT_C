package Labor_8.Stack;

import java.util.ArrayList;

public class Stack_Inheritance extends ArrayList<Object> {

    private final int capacity = 10;

    public void push(Object o) {
        if(super.size() != capacity)
            super.add(o);
    }
}
