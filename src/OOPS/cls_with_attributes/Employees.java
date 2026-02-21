package OOPS.cls_with_attributes;

public class Employees {
    String name;
    double salary;
    double bonus;

    Employees(String Name, double Salary, double Bonus){
        name = Name;
        salary = Salary;
        bonus = Bonus;
    }

    void displayDetails(){
        System.out.println("Employee name is " + name);
        System.out.println("Employee salary is Rs." + salary);
    }

    void applyBonus(){
        salary += bonus;
        System.out.println("Employee salary after bonus is Rs." + salary);
        System.out.println();
    }
}
class employee{
    public static void main() {
        Employees e1 = new Employees("Abc",50000.0,2000);
        Employees e2 = new Employees("Xyz",55000.0,3000);
        e1.displayDetails();
        e1.applyBonus();
        e2.displayDetails();
        e2.applyBonus();
    }
}
