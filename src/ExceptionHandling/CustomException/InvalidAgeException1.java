//Extended from checked Exception and used throws where JVM handles exceptions
package ExceptionHandling.CustomException;

public class InvalidAgeException1 extends Exception{
    InvalidAgeException1(String msg){
        super(msg);
    }
}

class Driver{
    void vote(int age)throws Exception{
        if(age < 18){
            throw new InvalidAgeException1("Age must me over 18!");
        }else{
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args) throws Exception{
       Driver d = new Driver();
        d.vote(23);
    }/*if we extend our custom exception from Exception class(checked) we use throws , if extend from
    RuntimeException(unchecked) we handle it manually by try catch block*/
}
