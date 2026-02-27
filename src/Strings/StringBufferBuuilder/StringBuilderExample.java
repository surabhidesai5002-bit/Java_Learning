package Strings.StringBufferBuuilder;

public class StringBuilderExample {
        public void stringAppend(){
            StringBuilder sb = new StringBuilder("Hello");
            System.out.println("Old String sb : " + sb);
            sb.append(" World");
            System.out.println("New String sb : " + sb);
        }

        public void stringInsert(){
            StringBuilder sb = new StringBuilder("Hello");
            System.out.println("Old String sb : " + sb);
            sb.insert(0,"World ");
            System.out.println("New String sb : " + sb);
        }

        public void stringReverse(){
            StringBuilder sb = new StringBuilder("Hello");
            System.out.println("Old String sb : " + sb);
            sb.reverse();
            System.out.println("New String sb : " + sb);
        }
}

class BuilderExample {
    public static void main(String[] args){
        StringBuilderExample sb = new StringBuilderExample();
        sb.stringAppend();
        sb.stringInsert();
        sb.stringReverse();
    }
}



