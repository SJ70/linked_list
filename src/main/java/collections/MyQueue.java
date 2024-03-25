package src.main.java.collections;

public class MyQueue<T> {

    private MyLinkedList<T> list = new MyLinkedList<>();

    public void add(T data) {
        list.add(data);
    }

    public T poll() {
        T data = list.get(0);
        list.delete(0);
        return data;
    }

}
