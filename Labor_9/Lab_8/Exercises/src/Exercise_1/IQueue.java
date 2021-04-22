package Exercise_1;

public interface IQueue {

    boolean isFull();
    boolean isEmpty();

    void enQueue(Object o);
    Object deQueue();

    void printQueue();

}
