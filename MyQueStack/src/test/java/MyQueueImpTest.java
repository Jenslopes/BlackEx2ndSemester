import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jennes on 01-12-2016.
 */
public class MyQueueImpTest {


    @Test
    public void add() throws Exception {
        MyQueueImp test = new MyQueueImp();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        assertEquals(test.size(), 5);
    }

    @Test
    public void remove() throws Exception {
        MyQueueImp test = new MyQueueImp();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.remove();
        assertEquals(test.size(), 4);
    }

    @Test
    public void isEmpty() throws Exception {
        MyQueueImp test = new MyQueueImp();
        assertEquals(test.isEmpty(), true);
    }

    @Test
    public void peek() throws Exception {
        MyQueueImp test = new MyQueueImp();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        assertEquals(test.peek(), 1);

    }

    @Test
    public void size() throws Exception {
        MyQueueImp test = new MyQueueImp();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        assertEquals(test.size(), 5);
    }

}