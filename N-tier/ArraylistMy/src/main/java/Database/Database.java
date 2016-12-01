package Database;

import BL.ArrayListMy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Jennes on 29-11-2016.
 */
public class Database {

    public ArrayListMy read() {
        ArrayListMy jens = new ArrayListMy();
        try {
            Scanner s = new Scanner(new File("C:\\Users\\Jennes\\OneDrive\\Dokumenter\\Java\\2. Semester\\BLACK ex\\N-tier\\ArraylistMy\\src\\main\\java\\Database\\number.txt"));
            while (s.hasNext()) {
                jens.add(s.nextInt());
            }
        } catch (FileNotFoundException e) {
        }
        return jens;
    }
}
