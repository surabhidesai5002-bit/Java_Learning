package ExceptionHandling.CheckedException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E4 {
    public static void main(String[] args) throws Exception{
        String str;
        BufferedReader bf=null;
        try{
           bf =new BufferedReader(new InputStreamReader(System.in));
           str = bf.readLine();
           //in this we can skip catch and directly use finally bcuz we used throws where exception is handled by JVM
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            bf.close();
        }
    }
}
