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

    public void setNextNode(T data) {
        this.nextNode = new Node<>(data);
    }

    public Node<T> getNextNode() {
        if (!this.hasNextNode()) {
            throw new NullPointerException("다음 노드가 없습니다.");
        }
        return nextNode;
    }

    public boolean hasNextNode() {
        return nextNode != null;
    }

}
