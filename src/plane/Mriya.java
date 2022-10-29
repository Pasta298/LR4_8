package plane;

public class Mriya extends Passenger {

    public Mriya() {
        this.flightDist = 2500;
        this.fuelConsumption = 20;
        this.passCapacity = 100;
        this.cargoCapacity = 5;
    }

    @Override
    public String toString() {
        return "Mriya, " + super.toString();
    }
}