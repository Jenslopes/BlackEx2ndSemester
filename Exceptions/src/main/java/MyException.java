/**
 * Created by Jennes on 22-09-2016.
 */
public class MyException extends Exception {

    public String str;

    public String getStr() {
        return str;
    }


    public void setStr(String str) {
        this.str = str;
    }

    public MyException(String str) {
        this.str = str;
    }

    public String toString() {
        return str;
    }

}
