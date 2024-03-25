package src.main.java.collections;

public class MyLinkedList<T> {

    private Node<T> node;
    private int size = 0;

    public T get(int index) {
        return this.getNode(index).getData();
    }

    public void add(T data) {
        if (this.isEmpty()) {
            this.node = new Node<>(data);
        }
        else {
            this.getNode(size - 1).setNextNode(data);
        }
        size++;
    }

    public Node<T> getNode(int index) {
        if (index < 0 || index >= size) {
            throw new NullPointerException("인덱스 에러");
        }
        Node<T> node = this.node;
        for (int i=0; i<index; i++) {
            node = node.getNextNode();
        }
        return node;
    }

    public boolean isEmpty() {
        return size == 0;
    }


}
