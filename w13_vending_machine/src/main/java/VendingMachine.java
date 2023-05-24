import java.util.*;

public class VendingMachine {

    private ArrayList<Coin> insertedCoins;
    private ArrayList<Coin> coinFloat;
    private double currentAmount;
    private ArrayList<Product> inventory;
    private ArrayList<Coin> validCoins;


    public VendingMachine(){
        this.insertedCoins = new ArrayList<>();
        this.coinFloat = new ArrayList<>();
        this.currentAmount = 0.0;
        this.inventory = new ArrayList<>();
        this.validCoins = new ArrayList<>(Arrays.asList(
                Coin.P5,
                Coin.P10,
                Coin.P20,
                Coin.P50,
                Coin.P100,
                Coin.P200
        ));
    }

    public ArrayList<Coin> getInsertedCoins() {
        return insertedCoins;
    }

    public ArrayList<Coin> getCoinFloat() {
        return coinFloat;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public ArrayList<Product> getInventory() {
        return inventory;
    }

    public ArrayList<Coin> getValidCoins() {
        return validCoins;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public void addProduct(Product product){
        inventory.add(product);
    }

    public void removeProduct(Product product){
        inventory.remove(product);
    }

    public boolean validateCoin(Coin coin){

        if (coin.getValueInPence() == 1 || coin.getValueInPence() == 2){
            return false;
        }
        return validCoins.contains(coin);
    }

    public void insertCoin(Coin coin){
        if (!validateCoin(coin)){
            return; //need to return the rejected coin
        }
        insertedCoins.add(coin);
        tallyCoins(coin);
    }

    public void tallyCoins(Coin coin){
        currentAmount += coin.getValueInPence();
    }

    public ArrayList<Coin> returnCoins(ArrayList<Coin> insertedCoins){
        ArrayList<Coin> returnedCoins = new ArrayList<>(insertedCoins);
        insertedCoins.clear();
        setCurrentAmount(0);
        return returnedCoins;
    }

    public void collectCoins(){
        for (int i = 0; i < insertedCoins.size(); i++){
            coinFloat.add(insertedCoins.get(i));
        }
        insertedCoins.clear();
    }

    public void calculateRemainingAmount(Product product){
        double remainingAmount = product.getPriceInPence() - getCurrentAmount();
        setCurrentAmount(remainingAmount);
    }

    public double calculateChange(Product product){
        double change = getCurrentAmount() - product.getPriceInPence();
        setCurrentAmount(change);
        return change;
    }

    public Object selectProduct(Product product){

        if(getCurrentAmount() >= product.getPriceInPence()){
            collectCoins();
            removeProduct(product);
            returnChange(calculateChange(product));
            setCurrentAmount(0);
            return product;
        }
        calculateRemainingAmount(product);
        return getCurrentAmount();
    }

    public void organiseChangeForEachCoin(Coin coin){
        while (coin.getValueInPence() <= getCurrentAmount() && getCurrentAmount() > 0) {
            getInsertedCoins().add(coin);
            setCurrentAmount(currentAmount - coin.getValueInPence());
        }
    }

    public ArrayList<Coin> returnChange(double changeTotal){
        getValidCoins().stream()
                .sorted(Comparator.reverseOrder())
                .forEach(this::organiseChangeForEachCoin);
        return returnCoins(getInsertedCoins());
    }

}
