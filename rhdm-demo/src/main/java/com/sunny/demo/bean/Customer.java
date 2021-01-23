package com.sunny.demo.bean;

public class Customer {
    private CustomerType type;

    private int years;

    public CustomerType getType() {
        return this.type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public int getYears() {
        return this.years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    private int discount;

    // Standard getters and setters

    public enum CustomerType {
        INDIVIDUAL,
        BUSINESS;
    }        
}
