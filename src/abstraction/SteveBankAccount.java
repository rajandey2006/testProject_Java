package abstraction;

//we want account details from 'AccountDetails' class and also ROI from interface 'Bank'

public class SteveBankAccount extends AccountDetails implements Bank{

    public static void main(String[] args) {

    SteveBankAccount s = new SteveBankAccount();
    s.account_number = "ABC111301";
    s.cust_address = "";
    s.cust_id = 1122334455;
    s.cust_name = "Steve Dyde";
    s.rateOfInterest_SavingsAcc();
    s.rateOfInterest_CreditCards();
    }

    @Override
    public void rateOfInterest_fixedAcc() {
    }

    @Override
    public void rateOfInterest_SavingsAcc() {
    System.out.println("The ROI for Saving Account is 7%");
    }

    @Override
    public void rateOfInterest_CreditCards() {
        System.out.println("The ROI for Credit Cared Account is 13%");
    }

    @Override
    public void rateOfInterest_Loans() {
    }
}
