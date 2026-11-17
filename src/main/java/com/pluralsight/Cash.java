package com.pluralsight;

import java.math.BigDecimal;

public class Cash extends Asset {

    // implement inherited info to the asset
    @Override

    // return the original cost since cash is retained in value
    public BigDecimal getValue() {
        return getOriginalCost();
    }

    // passing information to the asset constructor
    public Cash(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
    }
}
