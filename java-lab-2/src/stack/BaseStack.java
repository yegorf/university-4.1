package stack;

import exceptions.MyStackIsEmptyException;
import exceptions.MyStackOverflowException;

public interface BaseStack {
    Item pop() throws MyStackIsEmptyException; //Return 1 element (and delete it)
    void push(Item object) throws MyStackOverflowException; // Add element
    Item peek() throws MyStackIsEmptyException; // Return 1 element
    boolean isEmpty();
}
