package ExceptionHandling.CheckedException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E4TryWithResources {
    public static void main(String[] args) throws Exception {
        String str;
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter Something : ");
            str = bf.readLine();
            System.out.println("You Entered : " + str);
        }//here also we can skip catch and directly use finally bcuz we used throws where exception is handled by JVM
    }
}
