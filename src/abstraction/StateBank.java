package abstraction;

public class StateBank implements Bank{

    public static void main(String[] args) {


    }

    @Override
    public void rateOfInterest_fixedAcc() {
        System.out.println("The rate of interest for Fixed account is 9%");
    }

    @Override
    public void rateOfInterest_SavingsAcc() {
        System.out.println("The rate of interest for Savings account is 6%");
    }

    @Override
    public void rateOfInterest_CreditCards() {
        System.out.println("The rate of interest for CC account is 11%");
    }

    @Override
    public void rateOfInterest_Loans() {
        System.out.println("The rate of interest for Loans account is 9.8%");
    }
}
