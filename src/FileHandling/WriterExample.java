package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
    public static void main(String[] args) throws IOException {// can also handle exception manually by using try and catch
        //step 1 create writer class obj and create file
        FileWriter writer = new FileWriter("Student.txt");

        //step 2 -> write on the student.text
        writer.write("Hello Students\n Welcome to Java Class");
        //step 3 -> closing writer
        writer.close();
    }
}
