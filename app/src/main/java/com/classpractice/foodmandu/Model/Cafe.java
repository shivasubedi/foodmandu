package com.classpractice.foodmandu.Model;

public class Cafe {
    private String name;
    private String address;
    private String restype;
    private String deliveryhour;

    public Cafe(String name, String address, String restype, String deliveryhour) {
        this.name = name;
        this.address = address;
        this.restype = restype;
        this.deliveryhour = deliveryhour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRestype() {
        return restype;
    }

    public void setRestype(String restype) {
        this.restype = restype;
    }

    public String getDeliveryhour() {
        return deliveryhour;
    }

    public void setDeliveryhour(String deliveryhour) {
        this.deliveryhour = deliveryhour;
    }
}
