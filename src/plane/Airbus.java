package plane;

public class Airbus extends Cargo{
    public Airbus() {
        this.flightDist = 2000;
        this.fuelConsumption = 21;
        this.cargoCapacity = 48;
        this.passCapacity = 0;
    }
    @Override
    public String toString() {
        return "Airbus, " + super.toString();
    }
}