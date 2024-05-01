package entity;

public class Avion {
    private String model;
    private int seatingCapacity;
    private double fuelCapacity;
    private double currentFuelLevel;
    private boolean isFlying;

    public Avion(String model, int seatingCapacity, double fuelCapacity) {
        this.model = model;
        this.seatingCapacity = seatingCapacity;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = fuelCapacity;
        this.isFlying = false;
    }

    public void takeOff() {
        if (!isFlying && currentFuelLevel > 0) {
            System.out.println("Taking off...");
            isFlying = true;
        } else {
            System.out.println("Unable to take off. Either already flying or not enough fuel.");
        }
    }

    public void land() {
        if (isFlying) {
            System.out.println("Landing...");
            isFlying = false;
        } else {
            System.out.println("Unable to land. Already on the ground.");
        }
    }

    public void refuel(double amount) {
        if (!isFlying) {
            double spaceLeft = fuelCapacity - currentFuelLevel;
            if (amount <= spaceLeft) {
                currentFuelLevel += amount;
                System.out.println("Refueled " + amount + " liters.");
            } else {
                System.out.println("Cannot refuel. Fuel tank capacity exceeded.");
            }
        } else {
            System.out.println("Cannot refuel while flying.");
        }
    }

    public void fly(int distance) {
        if (isFlying) {
            double fuelConsumption = 0.1 * distance; // Simple fuel consumption calculation
            if (fuelConsumption <= currentFuelLevel) {
                currentFuelLevel -= fuelConsumption;
                System.out.println("Flying " + distance + " km...");
            } else {
                System.out.println("Cannot fly. Not enough fuel.");
            }
        } else {
            System.out.println("Cannot fly. Not in the air.");
        }
    }

    public void displayStatus() {
        System.out.println("Model: " + model);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Current Fuel Level: " + currentFuelLevel + " liters");
        System.out.println("Flying Status: " + (isFlying ? "In flight" : "On ground"));
    }
}
