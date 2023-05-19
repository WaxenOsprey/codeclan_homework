public class Plane {

    PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public PlaneType getPlaneType(){
        return planeType;
    }

    public int getPassengerCapacity() {
        return planeType.getPassenger_capacity();
    }

    public int getTotal_weight_capacity() {
        return planeType.getTotal_weight_capacity();
    }
}
