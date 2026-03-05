package Threads.LambdaExpression.withOutLambda;

interface Greeting{
    void sayHello();
}

public class Ex1 {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            @Override//this is an annotation , we use this to say jvm that it should override that function only
            public void sayHello() {
                System.out.println("Hello World");
            }
        };//semicolon mandatory
        g.sayHello();
    }
}
