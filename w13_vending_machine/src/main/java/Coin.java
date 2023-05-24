public enum Coin {


    P1(1),
    P2(2),
    P5(5),
    P10(10),
    P20(20),
    P50(50),
    P100(100),
    P200(200);

    private final int valueInPence;

    Coin(int valueInPence) {
        this.valueInPence = valueInPence;
    }

    public int getValueInPence() {
        return valueInPence;
    }
}

