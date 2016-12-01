/**
 * Created by Jennes on 27-09-2016.
 */
public interface MyQueue<T> {
    void add(T object);
    T remove();
    boolean isEmpty();
    T peek();
    int size();
    String toString();
}
