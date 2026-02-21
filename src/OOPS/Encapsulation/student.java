package OOPS.Encapsulation;

public class student {
    private String name;
    private int usn;

    student(String name, int usn){
        this.name = name;
        this.usn = usn;
    }

    void display(){
        System.out.println("Student details : name is " + name + ", usn is " + usn);
    }

    String getName(){
        return this.name;
    }

    String setName(String name) {
        this.name = name;
        return this.name;
    }

    int getUsn(){
        return this.usn;
    }

    int setUsn(int usn){
        this.usn = usn;
        return this.usn;
    }
}
class dive{
    public static void main(String[] args) {
        student s1 = new student("Manu",123);
        s1.display();

        System.out.println("name is "+ s1.getName());//cannot be accessed if name is private to access we need to remove private
        s1.setName("Amar");
        //(s1.name = "Akash";)//cannot be modified if name is encapsulated that is - it is private(cannot be accessed or modified directly can only be done using get and set)
        s1.display();//cannot be executed if s1.name causes error when name is encapsulated and stops execution

        System.out.println("usn is "+ s1.getUsn());//cannot be accessed if name is private to access we need to remove private
        s1.setUsn(234);
        s1.display();
    }
}

