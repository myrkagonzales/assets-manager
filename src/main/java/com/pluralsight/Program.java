package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        // store different asset types in one collection
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House(
                "My House",
                "2026-01-01",
                new BigDecimal(250000),
                "123 Main Street",
                1,
                2000,
                12000));
        assets.add(new Vehicle(
                "My Car",
                "2025-03-05",
                new BigDecimal("30000"),
                "Toyota Camry",
                2022,
                45000));
        assets.add(new Vehicle(
                "Diana's Truck",
                "2015-04-01",
                new BigDecimal("45000"),
                "Ford F150",
                2015,
                170000));

        // Polymorphism
        // An asset reference can point to either a house or vehicle object

        for (Asset asset : assets) {
            System.out.println("\n--------------------");

            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: " + asset.getOriginalCost());

            // call to get correct getValue method based on obj type
            System.out.println("Current Value: " + asset.getValue());
        }

        for (Asset asset : assets) {
            // determine actual object type at runtime
            if (asset instanceof House) {
                // downcast asset into house
                House house = (House) asset;
                System.out.println("House Address: " + house.getAddress());
            }
            else if (asset instanceof Vehicle) {
                // downcast asset into vehicle
                Vehicle vehicle = (Vehicle) asset;

                System.out.println("Vehicle: " + vehicle.getYear()+ " " + vehicle.getMakeModel());
            }
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Current Value: $" + asset.getValue());

        }

        }

    }

