package kumari.shweta.DesignPattern.structuraldesign.adapterDesign;

public interface BankAPIAdapter {

    double getBalance(String accountNumber);

    boolean sendMoney(String fromAccount, String toAccount, double amount);
}
