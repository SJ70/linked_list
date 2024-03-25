package src.test.java.collections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.collections.MyLinkedList;

public class MyLinkedListTest {

    private MyLinkedList<Integer> list;

    @BeforeEach
    public void setup() {
        list = new MyLinkedList<>();
    }

    @Test
    public void testGetSuccess() {
        list.add(1);
        list.add(2);
        list.add(3);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
    }

    @Test
    public void testGetFail() {
        list.add(1);
        list.add(2);
        list.add(3);
        Assertions.assertThrows(NullPointerException.class, () -> {
            list.get(-1);
        });
        Assertions.assertThrows(NullPointerException.class, () -> {
            list.get(3);
        });
    }

}
