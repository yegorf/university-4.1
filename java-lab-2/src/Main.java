import exceptions.MyStackIsEmptyException;
import exceptions.MyStackOverflowException;
import stack.BaseStack;
import stack.ClassicStack;
import stack.Item;
import stack.UnusualStack;

public class Main {
    public static void main(String[] args) {

        final int STACK_SIZE = 6;
        int[] order = {1, 0, 3, 2, 5, 4};
        BaseStack[] stacks = new BaseStack[]{new ClassicStack(STACK_SIZE), new UnusualStack(STACK_SIZE, order)};

        for (BaseStack stack : stacks) {
            for (int i = 0; i < STACK_SIZE; i++) {
                try {
                    stack.push(new Item(i));
                } catch (MyStackOverflowException e) {
                    System.out.println("Stack overflow!");
                }
            }
        }

        for (BaseStack stack : stacks) {
            try {
                while (true) {
                    System.out.println(stack.pop().getId());
                }
            } catch (MyStackIsEmptyException e) {
                System.out.println("Stack is empty!");
            }

        }

        //Without array (step by step)
        //Classic stack creation
        ClassicStack classicStack = new ClassicStack(6);

        //Classic stack filling
        try {
            classicStack.push(new Item(0));
            classicStack.push(new Item(1));
            classicStack.push(new Item(2));
            classicStack.push(new Item(3));
            classicStack.push(new Item(4));
            classicStack.push(new Item(5));
        } catch (MyStackOverflowException e) {
            System.out.println("Stack overflow!");
        }

        System.out.println("Classic stack print");
        try {
            while (true) {
                System.out.println(classicStack.pop().getId());
            }
        } catch (MyStackIsEmptyException e) {
            System.out.println("Stack is empty!");
        }

        //Create unusual stack
        UnusualStack unusualStack = new UnusualStack(6, order);

        //Unusual stack filling
        try {
            unusualStack.push(new Item(0));
            unusualStack.push(new Item(1));
            unusualStack.push(new Item(2));
            unusualStack.push(new Item(3));
            unusualStack.push(new Item(4));
            unusualStack.push(new Item(5));
        } catch (MyStackOverflowException e) {
            System.out.println("Stack overflow!");
        }

        System.out.println("Unusual stack print");
        try {
            while (true) {
                System.out.println(unusualStack.pop().getId());
            }
        } catch (MyStackIsEmptyException e) {
            System.out.println("Stack is empty!");
        }
    }
}
