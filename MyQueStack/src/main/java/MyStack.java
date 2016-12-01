/**
 * Created by Jennes on 27-09-2016.
 */
public interface MyStack<T> {
    void push(T object);
    T pop();
    boolean isEmpty();
    T peek();
    int size();
    void reSize();
    String toString();
}
