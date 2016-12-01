import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jennes on 06-10-2016.
 */
public class ArrayListMyTest {
    @Test
    public void reSize() {

    }

    @Test
    public void add() throws Exception {
        ArrayListMy ar = new ArrayListMy();
        ar.add(1);
        assertEquals(1, ar.size());
    }

    @Test
    public void add1() throws Exception {
        ArrayListMy ar = new ArrayListMy();
        ar.add(1, 1);
        assertEquals(1, ar.size());
    }

    @Test
    public void size() throws Exception {
        ArrayListMy ar = new ArrayListMy();
        ar.add(1);
        ar.add(2);
        assertEquals(ar.size(), 2);
    }

    @Test
    public void clear() {
        ArrayListMy ar = new ArrayListMy();
        ar.add(1);
        ar.add(2);
        ar.clear();
        assertEquals(0 , ar.size());
    }

    @Test
    public void indexOf() throws Exception {
        ArrayListMy ar = new ArrayListMy();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        assertEquals(ar.indexOf(2), 1);
    }

    @Test
    public void isEmpty()  {
        ArrayListMy ar = new ArrayListMy();

        assertEquals(ar.isEmpty(), true);
    }

    @Test
    public void lastIndexOf() throws Exception {
        ArrayListMy ar = new ArrayListMy();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(3);
        ar.add(3);
        ar.add(3);
        ar.add(3);
        assertEquals(ar.lastIndexOf(3), 6);
    }

    @Test
    public void contains() throws Exception {
        ArrayListMy ar = new ArrayListMy();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(3);
        ar.add(3);
        ar.add(3);
        ar.add(3);
        assertEquals(ar.contains(5), false);

    }

    @Test
    public void get() throws Exception {
        ArrayListMy ar = new ArrayListMy();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        ar.add(7);
        assertEquals(ar.get(2), 3);
    }

    @Test
    public void set() throws Exception {
        ArrayListMy ar = new ArrayListMy();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.set(1, 20);

        assertEquals(ar.get(1), 20);
    }

    @Test
    public void remove() throws Exception {
        ArrayListMy ar = new ArrayListMy();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.remove(3);
      assertEquals(2, ar.size());
    }

    @Test
    public void removeOb() throws Exception {
        ArrayListMy ar = new ArrayListMy();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.removeOb(4);
        System.out.println(ar);
        assertEquals(ar.size(), 3);
    }
}