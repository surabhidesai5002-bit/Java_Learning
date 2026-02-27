package Strings.StringBufferBuuilder;

public class StringBufferExample {
    public void stringAppend(){
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Old String sb : " + sb);
        sb.append(" World");
        System.out.println("New String sb : " + sb);
    }

    public void stringInsert(){
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Old String sb : " + sb);
        sb.insert(0,"World ");
        System.out.println("New String sb : " + sb);
    }

    public void stringReverse(){
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Old String sb : " + sb);
        sb.reverse();
        System.out.println("New String sb : " + sb);
    }
}

class BufferExample {
    public static void main(String[] args){
        StringBufferExample sb = new StringBufferExample();
        sb.stringAppend();
        sb.stringInsert();
        sb.stringReverse();
    }
}
