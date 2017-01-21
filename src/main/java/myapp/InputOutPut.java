package dan.ho.serial;

import com.google.gson.Gson;

import java.io.*;
import java.util.List;

/**
 * Created by Elmira on 21.01.2017.
 */
public class InputOutPut {
    private static void addToList(String item) {
        List<String> list = read();
        list.add(item);
        write(list);
    }

    private static List<String> read() {
        ObjectInputStream is = null;
        try {
            is = new ObjectInputStream(new FileInputStream("src/main/Cart"));
            return (List<String>) is.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    private static void write(List<String> list) {
        ObjectOutputStream os = null;
        try {
            os = new ObjectOutputStream(new FileOutputStream("src/main/Cart"));
            os.writeObject(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
