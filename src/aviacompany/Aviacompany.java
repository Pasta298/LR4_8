package aviacompany;

import plane.Plane;

import java.util.List;

public class Aviacompany {
    protected List<Plane> planes;
    private int totalCargoCap;
    private int totalPassCap;

    public List<Plane> getPlanes() {
        return planes;
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
        totalCargoCap += plane.getCargoCapacity();
        totalPassCap += plane.getPassCapacity();
    }

    public int getTotalCargoCap() {
        return totalCargoCap;
    }

    public int getTotalPassCap() {
        return totalPassCap;
    }

    public void printPlanes() {
        for (int i = 0; i < planes.size(); i++) {
            System.out.printf("%d)", i + 1);
            System.out.println("Літак: " + planes.get(i));
        }
    }
}