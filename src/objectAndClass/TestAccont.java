package objectAndClass;


import java.util.Scanner;

class Account {
    int accountNo;
    String name;
    float balance;

    void insert(int i, String n, float amt) {
        accountNo = i;
        name = n;
        balance = amt;
    }

    // deposit method
    void deposit(float bal) {
        balance = balance + bal;
        System.out.println("Deposit: " + balance);
    }

    // withdraw method

    void withdraw(float draw) {
        if (draw > balance) {
            System.out.println("Insufficient balance");
        }else
            balance = balance - draw;
        System.out.println("Withdraw: " + balance);
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}
public class TestAccont {
    public static void main(String[] args) {
        Account acc1 = new Account(), acc2 = new Account(), acc3 = new Account();

         acc1.insert(1, "Puga", 10);
         acc2.insert(2, "Maga", 100);
         acc3.insert(3, "Lua", 1000);

         acc1.deposit(40);
         acc2.withdraw(200);
         acc3.deposit(500);
    }

}

/*
*     static float deposit(float deposit) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deposit value:");
        deposit = scanner.nextFloat();
        return deposit;
    }

    static float withdraw(float withdraw) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Withdraw value:");
        withdraw = scanner.nextFloat();
        return withdraw;
    }

    static float finalBalance(float balance) {
        balance = this.balance;
    }
    *
    *     // method to initialize object
    //    void display() {
//        System.out.printf(
//                "Previous balance: %2.f" +
//                "\nWithdrawals: %.2f" +
//                "\nDeposits: %.2f" +
//                "\nBalance: %.2f", balance, withdraw(withdraw), deposit(), );
//    }*/

