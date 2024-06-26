package kumari.shweta.DesignPattern.structuraldesign.adapterDesign;

public class PhonePe {

    private BankAPIAdapter bankAPIAdapter;

    public PhonePe(BankAPIAdapter apiAdapter) {
        this.bankAPIAdapter = apiAdapter;
    }

    double doSomething() {

        double currentBalance = bankAPIAdapter.getBalance("accountNumber");
        return currentBalance * 2;
    }
}
