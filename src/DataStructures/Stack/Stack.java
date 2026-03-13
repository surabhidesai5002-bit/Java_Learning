package DataStructures.Stack;

public class Stack {
    int[] arr;
    int top;
    int size;
    Stack(int size){
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    void push(int val){
        if(top==size-1){
            System.out.println("Stack Overflow");
        }else{
            top++;
            arr[top] = val;
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return;
        }
        arr[top]=0;
        top--;
    }

    int Top(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }else{
            return arr[top];
        }
    }

    boolean isEmpty(){
        return top == -1;
    }
}

class driver{
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack.Top());
        stack.pop();
        stack.push(60);
        System.out.println(stack.Top());
        stack.pop();
        System.out.println(stack.Top());
        stack.pop();
        System.out.println(stack.Top());
        stack.pop();
        System.out.println(stack.Top());
        stack.pop();
        System.out.println(stack.Top());
        stack.pop();
        System.out.println(stack.Top());

    }
}