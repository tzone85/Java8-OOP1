/**
 * Created by Thando Mini on 1/12/2017.
 */
public class Main {

    public static void main (String [] args){
        BankAccount absa = new BankAccount();
        BankAccount capitec = new BankAccount();

        BankAccount fnb = new BankAccount(9877896,456458.22,"Thando Mini","thando@mini.uk", "0219 473 4598");

        System.out.println(fnb.getClientName() +" has " + fnb.getBalance()+ " left in the account.");
        System.out.println(fnb.getClientName() + " with email " +fnb.getClientEmail());

        absa.deposit(800000.00);
        capitec.deposit(65000000);

        absa.withdraw(15000);
        capitec.withdraw(1800000000);
    }
}
