import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Account> acct = new LinkedList<Account>();

        // Reading csv file//
        String file = "C:\\Users\\user\\Downloads\\original.csv";

        List<String[]> newCustomers = utilities.CSV.readMe(file);
        for (String[] accH : newCustomers) {

            String name = accH[0];
            String ssn = accH[1];
            String accountType = accH[2];
            double initialDeposite = Double.parseDouble(accH[3]);

            if (accountType.equals("Checking")) {
                acct.add(new CheckingAcc(name, ssn, initialDeposite));
            } else if (accountType.equals("Savings")) {
                acct.add(new SavingAcc(name, ssn, initialDeposite));
            } else {
                System.out.println("Error in identifying  AccountType.");
            }
        }

        for (Account ac1 : acct) {
            System.out.println("==================================");
            ac1.showInfo();
        }
    }

}