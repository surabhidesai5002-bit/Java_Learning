package OOPS.cls_with_attributes;

public class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String AccountHolder, double Balnace){
        accountHolder = AccountHolder;
        balance = Balnace;
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Balance after deposit is Rs." +balance);
    }

    void withdraw(double amount){
        if(amount < balance){
            balance -= amount;
            System.out.println("Amount withdrawn is Rs." + amount);
            System.out.println("Balance after withdraw is Rs."+ balance);
            System.out.println();
        }else if(amount > balance){
            System.out.println("Insufficient balance!");
        }
    }

    void displayBalance(){
        System.out.println("Account Holder Name is " + accountHolder);
        System.out.println("Current Balance is Rs." + balance);
    }
}

class Bank{
    public static void main() {
        BankAccount b1 = new BankAccount("Amar",5000);
        BankAccount b2 = new BankAccount("Akash",4000);
        b1.displayBalance();
        b1.deposit(200);
        b1.withdraw(5000);
        b2.displayBalance();
        b2.deposit(200);
        b2.withdraw(5000);
    }
}

