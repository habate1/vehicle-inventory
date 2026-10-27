package com.pluralsight;

import java.util.Scanner;

public class VehicleInventoryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create an array capable of holding up to 20 vehicles
        // wont have to do this for arrayList since its not a fixed size
        Vehicle[] inventory = new Vehicle[20];

        // create a variable that tells me how many vehicles are in the array rn
        int numVehicles = inventory.length;

        // create 6 vehicles and put them into the array
        Vehicle vehicle1 = new Vehicle(1234, "model", "red", 50000, 32000);
        Vehicle vehicle2 = new Vehicle(4321, "Camry", "green", 43000, 25000);
        Vehicle vehicle3 = new Vehicle(1111, "Jeep", "purple", 75000, 40000);
        Vehicle vehicle4 = new Vehicle(2222, "Civic", "black", 34000, 25500);
        Vehicle vehicle5 = new Vehicle(2222, "Civic", "black", 34000, 25500);
        Vehicle vehicle6 = new Vehicle(2222, "Civic", "black", 34000, 25500);

        inventory[0] = vehicle1;
        inventory[1] = vehicle2;
        inventory[2] = vehicle3;

        // create a loop with menu in the loop
        boolean appRunning = true;

        while (appRunning) {
            //create the menu
            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.println("Enter your command: ");

            //store the answer
            int command = scanner.nextInt();
            //do something based on the answer
            switch (command) {
                case 6 -> appRunning = false;
                default -> System.out.println("Invalid command");
            }

            // focus on menu items 1, 2, and 5
        }
    }

}
