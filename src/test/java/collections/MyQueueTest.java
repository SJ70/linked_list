package src.test.java.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.collections.MyQueue;

public class MyQueueTest {

    MyQueue<String> queue;

    @BeforeEach
    public void setup() {
        queue = new MyQueue<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
    }

    @Test
    public void pollTest() {
        Assertions.assertEquals("A", queue.poll());
        Assertions.assertEquals("B", queue.poll());
        Assertions.assertEquals("C", queue.poll());
        Assertions.assertThrows(NullPointerException.class, () -> {
            queue.poll();
        });
    }

}
