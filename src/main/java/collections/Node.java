package src.main.java.collections;

public class Node<T> {

    private T data;
    private Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setNextNode(Node<T> node) {
        this.nextNode = node;
    }

    public Node<T> getNextNode() {
        if (!this.hasNextNode()) {
            return null;
        }
        return nextNode;
    }

    public boolean hasNextNode() {
        return nextNode != null;
    }

}
