public abstract class Account implements IBaseRate {
    private String name;
    private String ssn;
    private double balance;
    // balance is initially initialDeposite//
    protected String accountNo;
    protected double iRate;

    private static int index = 10000;

    public Account(String name, String ssn, double initialDeposite) {
        this.name = name;
        this.ssn = ssn;
        balance = initialDeposite;
        this.accountNo = setAccountNo();
        setRate();
    }

    // compond interest method//
    public void compoundIn() {
        double newInterest = balance * (iRate / 100);
        balance = balance + newInterest;
        System.out.println("Your compoundInterest is $" + newInterest);
        printBalance();
    }

    // common methods //
    public void deposite(double amount) {
        balance = balance + amount;
        System.out.println("Your deposit is $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Your withdrawer is $" + amount);
        printBalance();
    }

    public void transfer(String where, double amount) {
        balance = balance - amount;
        System.out.println("Transfer amount : " + amount + " " + " TO : " + where);
        printBalance();
    }

    public void printBalance() {
        System.out.println(" Now Your balance is $ " + balance);
    }

    // setRate method//
    public abstract void setRate();

    // setAccount no//
    private String setAccountNo() {
        String lastSsnNo = ssn.substring(ssn.length() - 2, ssn.length());
        index++;
        int unigueNo = index;
        int randNo = (int) (Math.random() * Math.pow(10, 3));

        return lastSsnNo + unigueNo + randNo;
    }

    // printinfo methos//
    public void showInfo() {
        System.out.println("Name : " + name + "\nBalance :  $" + balance + "\nAccount Number : " + accountNo
                + "\nRate : " + iRate + "%");

    }

}