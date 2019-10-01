package stack;

import exceptions.MyStackIsEmptyException;
import exceptions.MyStackOverflowException;

public class ClassicStack implements BaseStack {
    private Node head;
    private int maxSize;
    private int size;

    static class Node {
        Item item;
        Node next;

        Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public ClassicStack(int maxSize) {
        head = null;
        this.maxSize = maxSize;
        size = 0;
    }

    @Override
    public Item pop() throws MyStackIsEmptyException {
        if (!isEmpty()) {
            Item item = head.item;
            head = head.next;
            return item;
        } else {
            throw new MyStackIsEmptyException();
        }
    }

    @Override
    public void push(Item item) throws MyStackOverflowException {
        if (size < maxSize) {
            head = new Node(item, head);
            size++;
        } else {
            throw new MyStackOverflowException();
        }
    }

    @Override
    public Item peek() throws MyStackIsEmptyException {
        if (!isEmpty()) {
            return head.item;
        } else {
            throw new MyStackIsEmptyException();
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
