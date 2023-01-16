public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int drink() {
        if (this.volume > 0){
            this.volume -= 10;
            return this.volume;
        } return this.volume;
    }

    public void empty() {
       this.volume = 0;
    }

    public int getVolume(){
        return this.volume;
    }

    public void fill(){
        this.volume = 100;
    }
}
