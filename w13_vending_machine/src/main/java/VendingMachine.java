import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class VendingMachine {

    private ArrayList<Coin> insertedCoins;
    private ArrayList<Coin> coinFloat;
    private double currentAmount;
    private ArrayList<Product> inventory;

    public VendingMachine(){
        this.insertedCoins = new ArrayList<>();
        this.coinFloat = new ArrayList<>();
        this.currentAmount = 0.0;
        this.inventory = new ArrayList<>();
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
        ArrayList<Integer> validCoins = new ArrayList<>(Arrays.asList(5, 10, 20, 50, 100, 200));

        if (coin.getValueInPence() == 1 || coin.getValueInPence() == 2){
            return false;
        }
        return validCoins.stream().anyMatch(value -> value == coin.getValueInPence());
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

    public ArrayList<Coin> returnCoins(ArrayList insertedCoins){
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

    public double calculateRemainingAmount(Product product){
        double remainingAmount = product.getPriceInPence() - getCurrentAmount();
        return remainingAmount;
    }

    public Object selectProduct(Product product){

        if(currentAmount >= product.getPriceInPence()){
            collectCoins();
            setCurrentAmount(0);
            removeProduct(product);
            return product;
        }
        return calculateRemainingAmount(product);
    }

}
