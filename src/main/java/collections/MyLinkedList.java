package src.main.java.collections;

public class MyLinkedList<T> {

    private Node<T> node;
    private int size = 0;

    public T get(int index) {
        return this.getNode(index).getData();
    }

    public void add(T data) {
        Node node = new Node<>(data);
        if (this.isEmpty()) {
            this.node = node;
        }
        else {
            this.getNode(size - 1).setNextNode(node);
        }
        size++;
    }

    public void delete(int index) {
        if (index == 0) {
            this.node = this.node.getNextNode();
        }
        else if (index == size - 1) {
            Node prevNode = this.getNode(index - 1);
            prevNode.setNextNode(null);
        }
        else {
            Node prevNode = this.getNode(index - 1);
            Node nextNode = prevNode.getNextNode().getNextNode();
            prevNode.setNextNode(nextNode);
        }
        size--;
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
