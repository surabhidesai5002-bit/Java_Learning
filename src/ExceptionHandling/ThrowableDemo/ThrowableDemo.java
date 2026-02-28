package ExceptionHandling.ThrowableDemo;

public class ThrowableDemo {
    static void function() throws Throwable{
        System.out.println("Something went wrong!");
    }

    static void main(String[] args){
        try {
            function();
        }catch(Throwable t){
            System.out.println(t.getMessage());
        }
    }//if not handled by try catch block use throws Throwable beside function usage
}
/*Allowed
throw new Exception("Message")
throw new RuntimeException("Message")
throw new Throwable("Message")

Not Allowed
throw new String X
throw new Integer x
 */
