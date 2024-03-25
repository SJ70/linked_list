package src.test.java.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.collections.MyStack;

public class MyStackTest {

    MyStack<String> stack;

    @BeforeEach
    public void setup() {
        stack = new MyStack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
    }

    @Test
    public void pollTest() {
        Assertions.assertEquals("C", stack.pop());
        Assertions.assertEquals("B", stack.pop());
        Assertions.assertEquals("A", stack.pop());
        Assertions.assertThrows(NullPointerException.class, () -> {
            stack.pop();
        });
    }

}
