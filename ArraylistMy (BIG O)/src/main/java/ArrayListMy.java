/**
 * Created by Jennes on 14-09-2016.
 */
public class ArrayListMy<T> {

    private T[] t;
    private  int capacity;
    private int size;

    public ArrayListMy() {
        this.capacity = 10;
        t = (T[]) new Object[capacity];
    }

    public void reSize() {             //O(n)
        this.capacity = capacity*2;
        T[] tempList = (T[]) new Object[capacity];
        for (int i = 0; i<t.length; i++) {
            tempList[i] = t[i];
        }
        this.t = tempList;
    }

    public void add(T object) {     //O(n)
        if (this.size >= capacity){
            reSize();
        }
        t[size++] = object;
    }

    public void add(int x, T object) {  //O(n)
        if (this.size == capacity) {
            reSize();
        }
        for (int i=size(); i>=x; i--) {
            t[i] = t[i+1];
        }
        t[x] = object;
        size++;
    }

    public int size() {   //O(1)

        return this.size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void clear() {     //O(1)
        this.size = 0;
        this.t = (T[]) new Object[10];


    }

    public int indexOf(T object) {   //O(n)
        int index = 0;
        for (int i=0; i<size(); i++) {
            if (t[i] == object) {
                index = i;

            }
        }
        return index;

    }

    public boolean isEmpty () {   //O(1)
        if (t[0] == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public int lastIndexOf(T object) {   //O(n)
        int index = 0;
        for (int i=size(); i>=0; i--) {
            if (t[i] == object) {
                return i;

            }
        }
        return -1;

    }

    public boolean contains(T object) {  //O(n)
       for (int i=0; i<size(); i++) {
           if (t[i] == object) {
               return true;
           }
       }
           return false;

    }

    public T get(int x) {   //O(1)
        return t[x];

    }

    public void set(int x, T object) {  //O(1)
        t[x] = object;
    }

    public void remove(int x) {   //O(n)
        for (int i=x; i<size()-1; i++) {
            t[i] = t[i+1];
        }
        t[size()-1] = null;
        size--;
    }

    public void removeOb(T object) {     //O(n^2)
        for (int i=0; i<= size(); i++) {
            if (t[i] == object) {
                remove(i); // remove contains loop
            }
        }
        size-=2;
    }

    public String toString() {   //O(n)
        String res = "";
        for (int i=0; i<size(); i++) {
            res += get(i)+"\n";
        }
        return res;
    }



 /*   +ArrayList()
OK +clear(): void
OK +contains(o: Object): boolean
OK +indexOf(o: Object): int
OK +isEmpty(): boolean
OK +lastIndexOf(o: Object): int
OK +remove(o: Object): boolean
OK +size(): int
OK +remove(index: int): boolean
OK +add(o: E): void
ok +add(index: int, o: E): void
OK +get(index:int): E
OK +set(index: int, o: E): E
*/

}
