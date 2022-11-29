package data.car;

public enum CarParts {
    ENGINE(10_000),
    TIRES(10_000);

    private double partCost;

    CarParts(double cost) {
        this.partCost = cost;
    }


    public double getPartCost() {
        return partCost;
    }

    public void setPartCost(double partCost) {
        this.partCost = partCost;
    }
}
