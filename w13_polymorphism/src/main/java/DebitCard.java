import java.util.ArrayList;

public class DebitCard extends PaymentCard{

    private double accountNumber;
    private String sortCode;

    private ArrayList<String> log;

    public DebitCard(double cardNumber, int expiryDate, int securityNumber, double accountNumber, String sortCode){
        super(cardNumber, expiryDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.log = new ArrayList<String>();
    }

    public double getCardNumber() {
        return super.getCardNumber();
    }

    public int getExpiryDate() {
        return super.getExpiryDate();
    }

    public int getSecurityNumber() {
        return super.getSecurityNumber();
    }

    public double getAccountNumber(){
        return this.accountNumber;
    }

    public String getSortCode(){
        return this.sortCode;
    }

    public void charge(double purchaseAmount){
        logTransaction("Purchase amount: " + purchaseAmount);
    }

    private void logTransaction(String message) {
        log.add(message);
    }


}
