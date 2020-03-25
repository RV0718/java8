package com.garood.java8.practice.repo;

public class Address {

    private String address, pincode,block;

    public Address(String address, String pincode, String block) {
        this.address = address;
        this.pincode = pincode;
        this.block = block;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                ", block='" + block + '\'' +
                '}';
    }
}
