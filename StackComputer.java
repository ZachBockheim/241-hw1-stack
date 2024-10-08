
import java.util.*;

/**
 * Create a stack computer
 */
public class StackComputer {
    public int SizeOfArray;
    public static int[] array;
    public int add;
    public int addtemp;
    public int pop;
    public int peek;
    public int counter = 0;
    public int maxsize;
    public int multemp;
    public int mul;
    public int divtemp;
    public int div;
    public int sub;
    public int subtemp;

    /**
     * Create a stack computer with a given maximum stack size
     */
    public StackComputer(int maxsize) {
        this.maxsize = maxsize;
        array = new int[maxsize];

    }

    /**
     * Return the array of ints that represents the stack
     */
    public int[] getStack() {
        return array;
    }

    /**
     * Return the number of elements in the stack
     */
    public int size() {

        return counter;
    }

    /**
     * Push a value on the stack. If stack full
     * throw a StackException
     */
    public void push(int value) throws StackException {
        if (counter == maxsize) {
            throw new StackException("Helloworld");
        } else {
            array[counter] = value;
            counter++;
        }

    }

    /**
     * Pop a value off the stack and return it. If the stack is empty
     * throw a StackException
     */
    public int pop() throws StackException {
        if (counter == maxsize) {
            throw new StackException();
        } else {
            pop = array[counter - 1];
            array[counter - 1] = 0;
            counter--;
        }
        return pop;

    }

    /**
     * Peek at a value on the stack. Throw a StackException if the stack is
     * empty
     */
    public int peek() throws StackException {
        if (counter == maxsize) {
            throw new StackException();
        } else {
            peek = array[counter - 1];
        }
        return peek;
    }

    /**
     * Pop two values off the stack, add them and push the result on the stack.
     * Throw a StackException if the stack is empty
     */
    public void add() throws StackException {
        if (counter == maxsize) {
            throw new StackException();
        } else {
            addtemp = array[counter - 2];
            array[counter - 2] = 0;
            add = array[counter - 1];
            array[counter - 1] = 0;
            int addValue = addtemp + add;
            counter = counter - 2;
            array[counter] = addValue;
            counter++;
        }

    }

    /**
     * Pop two values off the stack, subtract them and push the result on the
     * stack.
     * If arg1 is is below arg2 on the stack, then the result is arg1 - arg2.
     * Throw a StackException if the stack is empty.
     */
    public void sub() throws StackException {
        if (counter == maxsize) {
            throw new StackException();
        } else {
            subtemp = array[counter - 2];
            array[counter - 2] = 0;
            sub = array[counter - 1];
            array[counter - 1] = 0;
            int subValue = subtemp - sub;
            counter = counter - 2;
            array[counter] = subValue;
            counter++;
        }
    }

    /**
     * Pop two values off the stack, multiply them and push the result on the
     * stack.
     * Throw a StackException if the stack is empty
     */
    public void mul() throws StackException {
        if (counter == maxsize) {
            throw new StackException();
        } else {
            multemp = array[counter - 2];
            array[counter - 2] = 0;
            mul = array[counter - 1];
            array[counter - 1] = 0;
            int mulValue = multemp * mul;
            counter = counter - 2;
            array[counter] = mulValue;
            counter++;
        }
    }

    /**
     * Pop two values off the stack, divide them and push the result on the
     * stack.
     * If arg1 is is below arg2 on the stack, then the result is arg1 / arg2.
     * Throw a StackException if the stack is empty
     */
    public void div() throws StackException {
        if (counter == maxsize) {
            throw new StackException();
        } else {
            divtemp = array[counter - 2];
            array[counter - 2] = 0;
            div = array[counter - 1];
            array[counter - 1] = 0;
            int divValue = divtemp / div;
            counter = counter - 2;
            array[counter] = divValue;
            counter++;
        }
    }

    public static void main(String[] args) throws StackException {
        StackComputer comp = new StackComputer(5);
        comp.push(5);
        comp.push(10);
        comp.push(3);

        System.out.println(comp.size()); // should be 3

        comp.mul();
        System.out.println(comp.peek()); // should be 30

        comp.sub();
        System.out.println(comp.pop()); // should be -25
        throw new StackException();

    }
}
