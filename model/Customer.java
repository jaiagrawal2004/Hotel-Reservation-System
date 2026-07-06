package model;

public class Customer {

    private String customerId;
    private String name;
    private String mobile;

    public Customer(String customerId, String name, String mobile) {
        this.customerId = customerId;
        this.name = name;
        this.mobile = mobile;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return customerId + " | " + name + " | " + mobile;
    }
}