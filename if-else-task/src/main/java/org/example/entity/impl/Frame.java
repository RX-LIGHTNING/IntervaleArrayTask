package org.example.entity.impl;

import org.example.entity.CarPart;

public class Frame implements CarPart {
    private String partName;

    public Frame(String partName) {
        this.partName = partName;
    }

    @Override
    public String getPurpose() {
        return "Я корпус машины, я держу все детали вместе";
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }
}
