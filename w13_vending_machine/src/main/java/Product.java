public enum Product {

    COLA(100),
    CRISPS(50),
    SWEET(65);

    private final int priceInPence;

    Product(int valueInPence){
        this.priceInPence = valueInPence;
    }

    public int getPriceInPence(){
        return this.priceInPence;
    }

}
