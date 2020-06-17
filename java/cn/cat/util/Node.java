package cn.cat.util;

public class Node<T> {
    private T obj;
    private Node next;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "obj=" + obj +
                ", next=" + next +
                '}';
    }
}