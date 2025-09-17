public class Account {

    /// 2 stycken instansvariabler "balance" och "name"
    double balance;
    String name;

    ///  Konstruktor för att ta in "balance"
    public Account(double balance) {
        this.balance = balance;
    }
    /// Konstruktor för att sätta "balance" till 0.
    public Account() {
        this.balance = 0;
    }

    /// Metod för att minska saldot ("balance")
    public double withdraw(double amount) {
        this.balance -= amount;
        return balance;
    }

    /// Metod för att öka saldot ("balance")
    public double deposit(double amount) {
        this.balance += amount;
        return balance;
    }

    
}
