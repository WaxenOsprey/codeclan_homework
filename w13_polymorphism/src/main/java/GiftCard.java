public class GiftCard implements IChargable {

    private float balance;

    public GiftCard(float balance){
        this.balance = balance;
    }

    public float getBalance(){
        return this.balance;
    }

    public void charge(double purchaseAmount){
        balance -= purchaseAmount;
    }
}
