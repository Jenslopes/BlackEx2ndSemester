import static org.junit.Assert.*;

/**
 * Created by Jennes on 27-09-2016.
 */
public class MyStackImpTest {
    MyStackImp test = new MyStackImp();
    @org.junit.Before
    public void setUp() throws Exception {
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);

    }

    @org.junit.Test
    public void reSize() throws Exception {

    }

    @org.junit.Test
    public void push() throws Exception {
        int size = test.size();
        test.push(18);
        assertEquals(test.size(), size+1);
    }

    @org.junit.Test
    public void pop() throws Exception {
        int size = test.size();
        test.pop();
        assertEquals(test.size(), size-1);
    }

    @org.junit.Test
    public void isEmpty() throws Exception {
        assertEquals(test.isEmpty(), false);
    }

    @org.junit.Test
    public void peek() throws Exception {
        assertEquals(test.peek(), 5);
    }

    @org.junit.Test
    public void size() throws Exception {
        assertEquals(test.size(), 5);
    }

}