import java.util.ArrayList;
// static and non-static inner classes
public class GearBox {

    private ArrayList<Gear> gears;
    private int maxGear;
    private int gearNumber = 0;
    private boolean clutchIsIn;
    private int currentgear = 0;

    public GearBox(int maxGear) {
        this.maxGear = maxGear;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for (int i = 0; i < maxGear; i++){
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if ((number > 0) && (number <= maxGear)){
            this.gears.add(new Gear(number, ratio));
        }
    }
    public void changeGear(int newGear){
        if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn){
            this.currentgear = newGear;
            System.out.println("Gear " + newGear + " selected");
        }else{
            System.out.println("Grind!");
            this.currentgear = 0;
        }
    }
    public double wheelsSpeed (int revs){
        if(clutchIsIn){
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentgear).getRation();

    }

    private class Gear {
        private int gearNumber;
        private double ration;

        public Gear(int gearNumber, double ration) {
            this.gearNumber = gearNumber;
            this.ration = ration;

        }

        public double getRation() {
            return ration;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ration);
        }
    }


}
