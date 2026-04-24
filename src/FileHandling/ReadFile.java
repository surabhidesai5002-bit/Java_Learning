package FileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        try{
            //step 1 open file
            File file = new File("Student.txt");

            //step 2 read the file
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
