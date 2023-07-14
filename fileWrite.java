import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class fileWrite {
    private static ArrayList arr;

    public static void fileWrite(ArrayList<> arr) throws fileNotExistException, IOException {

        fileWrite.arr = arr;
        String name = "base.txt";
        try (FileWriter fw = new FileWriter("base.txt", true); 
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
            for (int i = 0; i < arr.size; i++) {
                if (i < arr.length - 1)
                    out.print("< " + arr[i] + " > ");
                else {
                    out.print("< " + arr[i] + " >;");
                    bw.newLine();
                }
            }

        } catch (FileNotFoundException e) {
            throw new fileNotExistException("Указанный файл не существует или поврежден");
        }
    }
}