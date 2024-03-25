package src.main.java.collections;

public class MyStack<T> {

    private MyLinkedList<T> list = new MyLinkedList<>();

    public void push(T data) {
        list.add(data);
    }

    public T pop() {
        int idx = list.size() - 1;
        T data = list.get(idx);
        list.delete(idx);
        return data;
    }

}
