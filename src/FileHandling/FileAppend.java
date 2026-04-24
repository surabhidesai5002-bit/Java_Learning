package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args){
        try{
            //step 1-> turn on append
            FileWriter writer = new FileWriter("Student.txt",true);

            //step 2 -> write data into the file
            writer.write("\nNew Line Added!");
            writer.close();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
