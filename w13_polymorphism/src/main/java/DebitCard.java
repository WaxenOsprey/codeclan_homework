public class DebitCard extends PaymentCard{

    private double accountNumber;
    private String sortCode;

    public DebitCard(double cardNumber, int expiryDate, int securityNumber, double accountNumber, String sortCode){
        super(cardNumber, expiryDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }


}
