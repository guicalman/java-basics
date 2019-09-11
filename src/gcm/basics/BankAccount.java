package gcm.basics;

public class BankAccount {

    // Instance Variables
    private float balance;
    private String accountNumber;
    private String accountType;
    private String ownerName;
    private String ownerId;

    //Constants
    private static float INTEREST_RATE = 0.25f;


    //Constructor that receives all the instance's variables
    public BankAccount(float balance, String accountNumber, String accountType, String ownerName, String ownerId) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.ownerName = ownerName;
        this.ownerId = ownerId;
    }

    //Method to withdraw money
    public float withdraw(float amount){
        if(balance >= amount){
            this.balance = this.balance - amount;
        }else{
            System.out.println("The amount you wnat to withdraw exceeds your balance, please try with a lower amount.");
        }
        return this.balance;
    }

    //Method to deposit
    public float deposit(float amount){
        this.balance= this.balance + amount;
        return this.balance;
    }

    public float calculateGainedInterests(int passedDays){
        float gainedInterest = (this.balance * INTEREST_RATE)/100 * (passedDays/30);
        return gainedInterest;
    }

    public static void main(String []args) {
        BankAccount account1 = new BankAccount(200, "789809808","Currency", "Guillermo Calderon", "10975478");
        BankAccount account2 = new BankAccount(400, "789809865", "Currency", "Guillermo Calderon", "10975478");
        printAccount(account1, 50, 23, 100);
        printAccount(account2, 100, 27, 50);
    }

    public static void printAccount(BankAccount myAccount, float amountToDeposit, int daysOfInterest, float amountToWithDraw){

        float amountAfterDeposit = myAccount.deposit(amountToDeposit);
        float amountOfInterest = myAccount.calculateGainedInterests(daysOfInterest);
        float amountAfterWithdraw = myAccount.withdraw(amountToWithDraw);

        System.out.println("Owner's ID: " + myAccount.ownerId);
        System.out.println("Owner's name: " + myAccount.ownerName);
        System.out.println("Account number: " + myAccount.accountNumber);
        System.out.println("Account type: " + myAccount.accountType);
        System.out.println("Current balance: " + amountAfterDeposit );
        System.out.println("Gained interests: " + amountOfInterest);
        System.out.println("Amount after withdraw: " + amountAfterWithdraw);
        System.out.println("------------------------------------------------------");
    }
}
