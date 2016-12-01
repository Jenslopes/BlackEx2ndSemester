package Database;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Jennes on 16-11-2016.
 */
public interface Data {

    public void getFile() throws FileNotFoundException;

    public ArrayList GetGList() ;
}
