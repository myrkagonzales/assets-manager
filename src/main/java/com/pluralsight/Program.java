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
    }
    // Polymorphism
    // an asset ref. can point to either a house obj or vehicle obj
    ArrayList<Asset> assets = new ArrayList<>();

}
