package com.pluralsight;

import java.math.BigDecimal;

public class House extends Asset {

    // Info for house
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;



    public House(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        // send common asset data to parent consstructor
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }
    @Override
    public BigDecimal getValue() {
        double ratePerSquareFoot = 180;

        // determine house value base on condition
        switch (condition) {
            case 1:
                ratePerSquareFoot = 180;
                break;
            case 2:
                ratePerSquareFoot = 130;
                break;
            case 3:
                ratePerSquareFoot = 90;
                break;
            case 4:
                ratePerSquareFoot = 80;
                break;
        }

        // house value = square footage value + lot value
        double value = (ratePerSquareFoot * squareFoot) + (lotSize * .25);

        return BigDecimal.valueOf(value);
    }
    }
