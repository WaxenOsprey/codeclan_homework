import java.util.ArrayList;

public class CreditCard extends PaymentCard {

    private float availableCredit;

    private ArrayList<String> log;

    public CreditCard(double cardNumber, int expiryDate, int securityNumber, float availableCredit){
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;
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

    public float getAvailableCredit(){
        return this.availableCredit;
    }

    @Override
    public void charge(double purchaseAmount) {
        double interest = (double) (purchaseAmount / 100) * 5.00f;
        double total = purchaseAmount + interest;
        this.availableCredit -= total;
        log.add(("Charged: " + total));
    }
}
