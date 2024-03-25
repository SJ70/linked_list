package src.main.java.collections;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {

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

    public int size() {
        return this.size;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node<T> currentNode = node;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NullPointerException("요소가 없음");
            }
            T data = currentNode.getData();
            currentNode = currentNode.getNextNode();
            return data;
        }
    }

}
