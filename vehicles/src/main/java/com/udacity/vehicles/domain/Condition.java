package com.udacity.vehicles.domain;

/**
 * Available values for condition of a given car.
 */
public enum Condition {

    USED ("USED"),
    NEW ("NEW");

    private final String code;

    Condition(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
