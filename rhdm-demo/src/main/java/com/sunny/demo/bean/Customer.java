package com.sunny.demo.bean;

public class Customer {
    private CustomerType type;

    private int years;

    private int discount;

    // Standard getters and setters

    public enum CustomerType {
        INDIVIDUAL,
        BUSINESS;
    }        
}
