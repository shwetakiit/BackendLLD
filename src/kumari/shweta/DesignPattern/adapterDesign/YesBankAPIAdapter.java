package kumari.shweta.DesignPattern.adapterDesign;

import kumari.shweta.DesignPattern.adapterDesign.thirdParty.yesBankAPI;

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
