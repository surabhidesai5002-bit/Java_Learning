//Extended from uncheckde Exception and used try catch block to handle
package ExceptionHandling.CustomException;

public class InvalidAgeException2 extends RuntimeException{
    InvalidAgeException2(String msg){
        super(msg);
    }
}

class Drive{
    static void vote(int age){
        if(age < 18){
            throw new InvalidAgeException2("Age must me over 18!");
        }else{
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args){
        try{
            vote(13);
        }catch(InvalidAgeException2 e){
            System.out.println(e.getMessage());
        }
    }/*if we extend our custom exception from Exception class(checked) we use throws , if extend from
    RuntimeException(unchecked) we handle it manually by try catch block*/
}