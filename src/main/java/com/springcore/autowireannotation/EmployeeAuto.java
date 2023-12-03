package com.springcore.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeAuto {
    @Autowired
    private AddressAuto address;

    public AddressAuto getAddress() {
        return address;
    }

    public void setAddress(AddressAuto address) {
        System.out.println("byType");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

}
