
public class Main {

    public static void main(String[] args) {

        Account account = new Account(1000 , "Patrik");

        System.out.println(account);

        account.deposit(500);
        System.out.println(account);

        account.withdraw(1000);
        System.out.println(account);




    }
}