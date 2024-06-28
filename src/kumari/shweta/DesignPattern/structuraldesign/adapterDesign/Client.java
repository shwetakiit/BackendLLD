package kumari.shweta.DesignPattern.structuraldesign.adapterDesign;

public class Client {

    public static void main(String[] args) {

        String userInput="ICICI";
        BankAPIAdapter bankAPIAdapter= new ICICIBankAPIAdapter();
        PhonePe phonePe = new PhonePe(bankAPIAdapter);

    }
}
