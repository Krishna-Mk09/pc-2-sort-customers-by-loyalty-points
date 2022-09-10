package com.jap.customers;

import java.util.Objects;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerGender;
    private boolean isSeniorCitizen;
    private String city;
    private int loyaltyPoints;

    public Customer(int customerId, String customerName, String customerGender, boolean isSeniorCitizen, String city, int loyaltyPoints) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerGender = customerGender;
        this.isSeniorCitizen = isSeniorCitizen;
        this.city = city;
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public boolean isSeniorCitizen() {
        return isSeniorCitizen;
    }

    public void setSeniorCitizen(boolean seniorCitizen) {
        isSeniorCitizen = seniorCitizen;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    // Override the toString method

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerGender='" + customerGender + '\'' +
                ", isSeniorCitizen=" + isSeniorCitizen +
                ", city='" + city + '\'' +
                ", loyaltyPoints=" + loyaltyPoints +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (customerId != customer.customerId) return false;
        if (isSeniorCitizen != customer.isSeniorCitizen) return false;
        if (loyaltyPoints != customer.loyaltyPoints) return false;
        if (!Objects.equals(customerName, customer.customerName))
            return false;
        if (!Objects.equals(customerGender, customer.customerGender))
            return false;
        return Objects.equals(city, customer.city);
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (customerGender != null ? customerGender.hashCode() : 0);
        result = 31 * result + (isSeniorCitizen ? 1 : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + loyaltyPoints;
        return result;
    }
}
