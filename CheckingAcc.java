public class CheckingAcc extends Account {

    private int debtCNo;
    private int debtPin;

    public CheckingAcc(String name, String ssn, double initialDeposite) {
        super(name, ssn, initialDeposite);
        accountNo = "2" + accountNo;
        setDebitcard();

    }

    // setrate method//
    @Override
    public void setRate() {
        iRate = getBaseRate() * .15;
    }

    // setdebitcard //
    private void setDebitcard() {
        debtCNo = (int) (Math.random() * Math.pow(10, 12));
        debtPin = (int) (Math.random() * Math.pow(10, 4));
    }

    // show info override//
    public void showInfo() {
        super.showInfo();
        System.out.println("Account Type : Checking");
        System.out.println(
                "Checking Account has : \n    DebitCard No. : " + debtCNo + "\n    DebitCard PIN : " + debtPin);
    }

}
