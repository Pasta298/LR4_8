package plane;

public class Boeing extends Passenger{
    public Boeing() {
        this.flightDist = 1500;
        this.fuelConsumption = 18;
        this.passCapacity = 350;
        this.cargoCapacity = 15;
    }

    @Override
    public String toString() {
        return "Boeing, " + super.toString();
    }
}
