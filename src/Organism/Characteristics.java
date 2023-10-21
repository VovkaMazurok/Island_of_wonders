package Organism;

import Organism.Actions.Multiply;

public  class Characteristics implements Multiply {


    private double weight;
    private int maxCount;
    private int speed;
    private double foodNeeded;



    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFoodNeeded() {
        return foodNeeded;
    }

    public void setFoodNeeded(double foodNeeded) {
        this.foodNeeded = foodNeeded;
    }

    @Override
    public String toString() {
        return "Organism{" +
                "weight=" + weight +
                ", maxCount=" + maxCount +
                ", speed=" + speed +
                ", foodNeeded=" + foodNeeded +
                '}';
    }

    @Override
    public void multiply() {

    }
}
