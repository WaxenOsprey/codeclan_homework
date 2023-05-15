public class WaterBottle {

    public int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int drink(){
        return this.volume -= 10;
    }

    public int empty(){
        this.volume = 0;
        return this.volume;
    }

    public int fill(){
        this.volume = 100;
        return this.volume;
    }

}
