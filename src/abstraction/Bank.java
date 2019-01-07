package abstraction;

public interface Bank {      // this interface works as a super class for all the classes that implement this

    void rateOfInterest_fixedAcc(); // By default, they are all public abstract even if not specified
    public abstract void rateOfInterest_SavingsAcc();
    public abstract void rateOfInterest_CreditCards();
    public abstract void rateOfInterest_Loans();
}
