/**
 * Created by Jennes on 22-09-2016.
 */
public class MyException2 extends Exception {

    public String str;

    public MyException2(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String toString() {
        return str;
    }
}
