package week5;

public class Account {
    private int accountBalance = 600;

    // getter method : int type(return int value)
    public int getAccountBalance() {

        return accountBalance;
    }

    //setter method : void(no return value)
    public void setAccountBalance(int accountBalance) {
        this.accountBalance += accountBalance; // this.accountBalance = accountBalance + accountBalance(from parameter)
    }

    public static void main(String[] args) {
        Account account = new Account();  // creating an Account class object

        int number = account.getAccountBalance();
        System.out.println("get the accountBalance through getter method the first time: " + number);

        account.setAccountBalance(400); //set the value or update the account balance with 400
//        return1 = account.getAccountBalance();
        System.out.println("Set the accountBalance through setter method after calling the setter method(400) : " + account.getAccountBalance());
    }
}
