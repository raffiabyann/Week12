package week12.raffi.id.umn.ac;
import java.io.File;

public class file_handling {

    public static void main(String[] args) {
        File Obj = new File("myfile.txt");
        if (Obj.delete()) {
            System.out.println("The deleted file is : " + Obj.getName());
        } else {
            System.out.println("Failed in deleting the file.");
        }
    }
}


