package plane;

public abstract class Cargo extends Plane {
    @Override
    public String toString() {
        return "Cargo plane, " + super.toString();
    }
}