public class CreditCard extends PaymentCard {

    private float availableCredit;

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


}
