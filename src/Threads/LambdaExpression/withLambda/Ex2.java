package Threads.LambdaExpression.withLambda;

interface Calculator{
    int add(int a, int b);
}

public class Ex2 {
    public static void main(String[] args) {
        //anonymous function with parameters
        /* Calculator c = (a,b) -> return a + b;
        (this is also a way of writing lambda function, if the function is too long we use the below one, otherwise
         this)*/
        Calculator c = (a,b) ->{
           return a + b;
        };
        System.out.println("Sum of two numbers is " + c.add(15,16));
    }
}
