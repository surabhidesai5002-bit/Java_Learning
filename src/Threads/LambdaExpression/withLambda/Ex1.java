package Threads.LambdaExpression.withLambda;

interface Greeting{
    void sayHello();
}

public class Ex1 {
    public static void main(String[] args) {
        /*Greeting g = () -> System.out.println("Hello World");
         (this is also a way of writing lambda function, if the function is too long we use the below one, otherwise
         this)
         */
        Greeting g = () ->{//lambda function usage this is the syntax which need to followed
            System.out.println("Hello World");
        };//semicolon mandatory
    }
}

//we can only use lambda functions with the interfaces which has only one abstract method