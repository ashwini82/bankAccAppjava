
public class SavingAcc extends Account {

    private int safetyBalanceBoxId;
    private int safetyBalanceBoxKey;

    public SavingAcc(String name, String ssn, double initialDeposite) {
        super(name, ssn, initialDeposite);
        accountNo = "1" + accountNo;
        safetyBoxInfo();
    }

    // setrate info//
    public void setRate() {
        iRate = getBaseRate() - .25;
    }

    // safetybox id and key//
    public void safetyBoxInfo() {
        safetyBalanceBoxId = (int) (Math.random() * Math.pow(10, 3));
        safetyBalanceBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    // show info override//
    public void showInfo() {
        super.showInfo();
        System.out.println("Account Type : Saving");
        System.out.println("Saving Account has : \n    SafetyBalanceBox Id : " + safetyBalanceBoxId
                + "\n    SafetyBalanceBoxKey : " + safetyBalanceBoxKey);
    }
}