public enum PlaneType {

    AIRBUS_A380(853, 550000),
    BOEING_747(600, 450000),
    LOCKHEED_C130_HERCULES(92, 70000),
    EMBRAER_E_JET(124, 22000),
    BOMBARDIER_CRJ700(70, 35000);

    private final int passenger_capacity;
    private final int total_weight_capacity;

    PlaneType(int passenger_capacity, int total_weight_capacity){
        this.passenger_capacity = passenger_capacity;
        this.total_weight_capacity = total_weight_capacity;
    }

    public int getPassenger_capacity(){
        return this.passenger_capacity;
    }

    public int getTotal_weight_capacity(){
        return this.total_weight_capacity;
    }

}
