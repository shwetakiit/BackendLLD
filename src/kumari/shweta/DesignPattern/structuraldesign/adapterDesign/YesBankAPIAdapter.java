package kumari.shweta.DesignPattern.structuraldesign.adapterDesign;

import kumari.shweta.DesignPattern.structuraldesign.adapterDesign.thirdParty.yesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter {

    private yesBankAPI yesBankAPI = new yesBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
