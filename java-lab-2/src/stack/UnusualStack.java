package stack;

import exceptions.MyStackIsEmptyException;
import exceptions.MyStackOverflowException;

public class UnusualStack implements BaseStack {
    private int[] order;
    private Item[] items;
    private int maxSize;
    private int top;

    public UnusualStack(int maxSize, int[] order) {
        this.maxSize = maxSize;
        this.order = order;
        items = new Item[maxSize];
        top = 0;
    }

    @Override
    public Item pop() throws MyStackIsEmptyException {
        if (!isEmpty()) {
            return items[--top];
        } else {
            throw new MyStackIsEmptyException();
        }
    }

    @Override
    public void push(Item item) throws MyStackOverflowException {
        if (top < maxSize) {
            items[order[top]] = item;
            top++;
        } else {
            throw new MyStackOverflowException();
        }
    }

    @Override
    public Item peek() throws MyStackIsEmptyException {
        if (!isEmpty()) {
            return items[top];
        } else {
            throw new MyStackIsEmptyException();
        }
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }
}
