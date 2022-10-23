package plane;

public class Douglas extends Cargo{

    public Douglas() {
        this.flightDist = 3000;
        this.fuelConsumption = 15;
        this.cargoCapacity = 77;
        this.passCapacity = 0;
    }

    @Override
    public String toString() {
        return "Douglas, " + super.toString();
    }
}
