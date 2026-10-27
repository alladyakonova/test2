public class BankAccount {
    String owner;
    int balance;



    BankAccount (String someOwner, int someBalance) {
        this.owner = someOwner;
        this.balance = someBalance;
    }

    String getOwner() {
        return this.owner;
    }

    int getBalance() {
        return this.balance;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public int deposit (int amount) {
        return this.balance + amount;
    }

    public int withdraw (int amount) {
        return this.balance - amount;
    }

    public void printBalance () {
        System.out.println("Баланс: " + this.balance);
    }
}
