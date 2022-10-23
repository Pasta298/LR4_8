package plane;

public abstract class Plane {
    private String name;
    protected int flightDist;
    protected int fuelConsumption;
    protected int cargoCapacity;
    protected int passCapacity;

    public int getFlightDist() {
        return flightDist;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getPassCapacity() {
        return passCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Name: " + name +
                ", Flight distance: " + flightDist +
                ", Fuel Consumption: " + fuelConsumption +
                ", Cargo Capacity: " + cargoCapacity +
                ", Passengers Capacity: " + passCapacity;
    }
}