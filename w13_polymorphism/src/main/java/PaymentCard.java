
public abstract class PaymentCard implements IChargeable{

    private double cardNumber;
    private int expiryDate;
    private int securityNumber;

    public PaymentCard(double cardNumber, int expiryDate, int securityNumber){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }

    public double getCardNumber(){
        return this.cardNumber;
    }

    public int getExpiryDate(){
        return this.expiryDate;
    }

    public int getSecurityNumber(){
        return this.securityNumber;
    }

}


