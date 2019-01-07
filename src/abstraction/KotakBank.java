package abstraction;

public class KotakBank implements Bank {


    @Override
    public void rateOfInterest_fixedAcc() {
        System.out.println("The rate of interest for Fixed account is 8%");
    }

    @Override
    public void rateOfInterest_SavingsAcc() {
        System.out.println("The rate of interest for Savings account is 5.7%");
    }

    @Override
    public void rateOfInterest_CreditCards() {
        System.out.println("The rate of interest for CC account is 10.8%");
    }

    @Override
    public void rateOfInterest_Loans() {
        System.out.println("The rate of interest for Loans account is 8.85");
    }
}
