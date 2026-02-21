package OOPS.Inheritance;

public class Person {
    String fname;
    String lname;

    Person(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }
}

class Student extends Person{
    int usn;

    Student(String fname, String lname,int usn){
        super(fname,lname);
        this.usn = usn;
    }

    void print(){
        System.out.println("first name: "+ fname + "\nlast name: "+ lname + "\nusn: "+ usn);
    }
}

class driver{
    public static void main(String[] args) {
        Student s1 = new Student("Amala", "paul",123);
        s1.print();
    }
}