import java.util.*;
import java.util.Iterator;

/**
 * Created by Jennes on 27-09-2016.
 */
public class MyStackImp<T> implements MyStack<T>, Container {

    private T[] list;
    private int capacity = 10;
    private int size = 0;

    @Override
    public Iterator getIterator() {
        return new MyIterator();
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
                return list[index++];
            }
            return null;
        }
    }


    public MyStackImp() {
        this.capacity = 10;
        list = (T[]) new Object[capacity];
    }

    public void reSize () {
        this.capacity = capacity*2;
        T[] tempList = (T[]) new Object[capacity];
        for (int i = 0; i<list.length; i++) {
            tempList[i] = list[i];
        }
        this.list = tempList;
    }

    public void push(T object) {
        if (size == capacity) {
            reSize();
        }
        list[size] = object;
        size++;
    }

    public T pop() {
        T object = list[size-1];
        size--;
        return object;

    }

    public boolean isEmpty() {
        return size<=0;
    }

    public T peek() {
        return list[size-1];
    }

    public int size() {
        return size;
    }

    public String toString() {
        String str = "";
        for (int i=0; i<size; i++) {
            str += list[i];
            str += "\n";
        }
        return str;
    }


}
