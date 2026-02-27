package ExceptionHandling;

public class E3 {
      static void CheckAge(int age){
          if(age >=18){
              System.out.println("Age is "+age);
          }else{
              throw new RuntimeException("Not Eligible-Access Denied");
          }
    }

    public static void main(String[] args) {
          CheckAge(25);
          CheckAge(12);
    }
}
