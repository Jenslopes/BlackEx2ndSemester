import java.util.*;
import java.util.Iterator;

/**
 * Created by Jennes on 27-09-2016.
 */
public class MyQueueImp<T> implements MyQueue<T>, Container {

    private LinkedList<T> list;
    private int size =0;
    private int first = 0;

    @Override
    public java.util.Iterator getIterator() {
        return new MyQueueImp.MyIterator();
    }

    private class MyIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < size){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return list.get(index++);
            }
            return null;
        }
    }

    public MyQueueImp() {
        list = new LinkedList<T>();
    }

    public void add(T object) {
        list.add(object);
        size++;
    }

    public T remove() {
        T ret = list.get(first);
        list.remove(first);
        size--;
        return ret;
    }

    public boolean isEmpty() {
        return size<=0;
    }

    public T peek() {
        return list.get(first);
    }

    
    public int size() {
        return size;
    }

    public String toString() {
        String str = "";
        for (int i=0; i<size; i++) {
            str += list.get(i);
            str += "\n";
        }
        return str;
    }
}
