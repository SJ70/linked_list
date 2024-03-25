package src.collections;

public class MyLinkedList<T> {

    private Node<T> node;
    private int size = 0;

    public T get(int index) {
        Node<T> node = this.node;
        for (int i=0; i<index; i++) {
            node = node.getNextNode();
        }
        return node.getData();
    }

}
