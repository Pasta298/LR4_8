package plane;

import java.io.Serial;
import java.io.Serializable;

public class Mriya extends Passenger implements Serializable {
    @Serial
    private static final long serialVersionUID = 4L;

    public Mriya(String name) {
        super.name = name;
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