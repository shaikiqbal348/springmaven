package com.springcore.lifecycle;

public class Animal {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animal() {
        super();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                '}';
    }

    public void init(){
        System.out.println("Inside init method");
    }
    public void destory(){
        System.out.println("Inside destory method");
    }
}
