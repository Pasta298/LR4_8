package plane;

public abstract class Passenger extends Plane {
    @Override
    public String toString() {
        return "Passenger plane, " + super.toString();
    }
}