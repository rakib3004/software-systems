package src.JavaExamples;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
    private String registrationNumber;
    private String model;
    private double fuelLevel;

    public Vehicle(String registrationNumber, String model, double fuelLevel) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.fuelLevel = fuelLevel;
    }

    public void displayInfo() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Model: " + model);
        System.out.println("Fuel Level: " + fuelLevel + " liters");
    }

    public void fillFuel(double amount) {
        fuelLevel += amount;
        System.out.println("Fuel filled: " + amount + " liters");
    }

    public void drive(double distance) {
        if (distance * 0.1 <= fuelLevel) {
            fuelLevel -= distance * 0.1;
            System.out.println("Vehicle driven for " + distance + " km");
        } else {
            System.out.println("Insufficient fuel to drive!");
        }
    }
}

public class TransportManagement {
    private List<Vehicle> vehicles;

    public TransportManagement() {
        this.vehicles = new ArrayList<>();
    }

    // Method 1: Add new vehicle
    public void addVehicle(String registrationNumber, String model, double fuelLevel) {
        Vehicle newVehicle = new Vehicle(registrationNumber, model, fuelLevel);
        vehicles.add(newVehicle);
        System.out.println("New vehicle added successfully!");
    }

    // Method 2: Remove a vehicle
    public void removeVehicle(String registrationNumber) {
        vehicles.removeIf(vehicle -> vehicle.getRegistrationNumber().equals(registrationNumber));
        System.out.println("Vehicle removed successfully!");
    }

    // Method 3: Display all vehicles
    public void displayAllVehicles() {
        System.out.println("All Vehicles:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }

    // Method 4: Fill fuel in a vehicle
    public void fillFuelInVehicle(String registrationNumber, double amount) {
        Vehicle vehicle = findVehicle(registrationNumber);
        if (vehicle != null) {
            vehicle.fillFuel(amount);
            System.out.println("Fuel filled successfully!");
        } else {
            System.out.println("Vehicle not found!");
        }
    }

    // Method 5: Drive a vehicle
    public void driveVehicle(String registrationNumber, double distance) {
        Vehicle vehicle = findVehicle(registrationNumber);
        if (vehicle != null) {
            vehicle.drive(distance);
        } else {
            System.out.println("Vehicle not found!");
        }
    }

    // Method 6: Find vehicle by registration number
    private Vehicle findVehicle(String registrationNumber) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                return vehicle;
            }
        }
        return null;
    }

    // Method 7: Perform multiple actions on a vehicle
    public void performMultipleActions(String registrationNumber, double fuelToAdd, double distanceToDrive) {
        Vehicle vehicle = findVehicle(registrationNumber);
        if (vehicle != null) {
            vehicle.displayInfo();
            System.out.println();

            vehicle.fillFuel(fuelToAdd);
            vehicle.drive(distanceToDrive);
        } else {
            System.out.println("Vehicle not found!");
        }
    }

    // Method 8: Display the total number of vehicles
    public void displayTotalVehicles() {
        System.out.println("Total Number of Vehicles: " + vehicles.size());
    }
}
