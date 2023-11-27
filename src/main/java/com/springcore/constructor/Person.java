package com.springcore.constructor;

import java.util.List;

public class Person {
    private String personName;
    private int personId;
    private Certificate certificate;
    private List<String> list;

    public Person(String personName, int personId, Certificate certificate, List<String> list) {
        this.personName = personName;
        this.personId = personId;
        this.certificate = certificate;
        this.list=list;
    }


    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personId=" + personId +
                ", certificate=" + certificate +
                ", list=" + list +
                '}';
    }
}
