package src.test.java.collections;
import java.util.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.collections.MyLinkedList;

public class MyLinkedListTest {

    private MyLinkedList<String> list;

    @BeforeEach
    public void setup() {
        list = new MyLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
    }

    @Test
    public void testGetSuccess() {
        Assertions.assertEquals("A", list.get(0));
        Assertions.assertEquals("B", list.get(1));
        Assertions.assertEquals("C", list.get(2));
    }

    @Test
    public void testGetFail() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            list.get(-1);
        });
        Assertions.assertThrows(NullPointerException.class, () -> {
            list.get(3);
        });
    }

    @Test
    public void testDeleteFirstSuccess() {
        list.delete(0);
        Assertions.assertEquals("B", list.get(0));
        Assertions.assertEquals("C", list.get(1));
    }

    @Test
    public void testDeleteMiddleSuccess() {
        list.delete(1);
        Assertions.assertEquals("A", list.get(0));
        Assertions.assertEquals("C", list.get(1));
    }

    @Test
    public void testDeleteLastSuccess() {
        list.delete(2);
        Assertions.assertEquals("A", list.get(0));
        Assertions.assertEquals("B", list.get(1));
    }

    @Test
    public void testDeleteFail() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            list.delete(-1);
        });
        Assertions.assertThrows(NullPointerException.class, () -> {
            list.get(3);
        });
    }

    @Test
    public void testIteratorHasNext() {
        Iterator<String> iterator = list.iterator();
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("A", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("B", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("C", iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorEmpty() {
        MyLinkedList<String> emptyList = new MyLinkedList<>();
        Iterator<String> iterator = emptyList.iterator();
        Assertions.assertFalse(iterator.hasNext());
    }

}
