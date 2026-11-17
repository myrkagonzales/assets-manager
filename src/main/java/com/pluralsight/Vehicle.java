package com.pluralsight;

import java.math.BigDecimal;
import java.text.Bidi;
import java.time.Year;

public class Vehicle extends Asset {

    // Information of the vehicle
    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description,
                   String dateAcquired,
                   BigDecimal originalCost,
                   String makeModel,
                   int year,
                   int odometer) {
                       // pass shared asset properties to parent
                         super(description, dateAcquired, originalCost);
                         this.makeModel = makeModel;
                         this.year = year;
                         this.odometer = odometer;
    }
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public BigDecimal getValue() {

        double value = getOriginalCost().doubleValue();

        // calculate vehicle age
        int age = Year.now().getValue() - year;

        // depreciate value base on age range
        if (age <= 3) {
            value *= (1 - (.03 * age));
        }
        else if (age <= 6) {
            value *= (1-(.06 * age));
        }
        else if (age <= 10) {
            value *=(1-(.08 * age));
        }
        else {
            value = 1000;
        }
        // Honda and Toyota keep value better
        boolean preferredBrand = makeModel.contains("Honda") ||
                                    makeModel.contains("Toyota");
        // reduce value if mileage exceeds 100,000
        if (odometer > 100000 && !preferredBrand) {
            value *= .75;
        }
        return BigDecimal.valueOf(value);
    }
}
