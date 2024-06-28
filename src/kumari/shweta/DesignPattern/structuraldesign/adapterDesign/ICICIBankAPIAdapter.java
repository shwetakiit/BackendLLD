package kumari.shweta.DesignPattern.structuraldesign.adapterDesign;

import kumari.shweta.DesignPattern.structuraldesign.adapterDesign.thirdParty.iciciBankAPI;

public class ICICIBankAPIAdapter  implements  BankAPIAdapter{

    private iciciBankAPI icicBankAPI= new iciciBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
