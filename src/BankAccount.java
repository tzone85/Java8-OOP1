/**
 * Created by Thando Mini on 1/12/2017.
 */
public class BankAccount {
    private long accountNum;
    private double balance;
    private String clientName;
    private String clientEmail;
    private String clientPhoneNum;

    public BankAccount(){
        this(12356789, 0.00,"default name", "default email", "default phonenum");
        System.out.println("Empty Constructor Called");
    }

    public BankAccount(long accountNum, double balance, String clientName, String clientEmail, String clientPhoneNum){
        System.out.println("Parametized constructor called");
        this.accountNum = accountNum;
        this.balance = balance;
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.clientPhoneNum = clientPhoneNum;
    }

    public void deposit(double depAmount){
//        double newTotal = this.setBalance(depAmount) + depAmount;
        this.balance += depAmount;
        System.out.println("New Balance after deposit: "+ this.balance);
    }

    public void withdraw(double withdrawalAmount){
        if((balance - withdrawalAmount) > 0){
            this.balance = balance - withdrawalAmount;
            System.out.println("New Balance after withdrawal: "+ balance);
        }else{
            System.out.println("Error!!");
        }
    }

    public long getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(long accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPhoneNum() {
        return clientPhoneNum;
    }

    public void setClientPhoneNum(String clientPhoneNum) {
        this.clientPhoneNum = clientPhoneNum;
    }
}
