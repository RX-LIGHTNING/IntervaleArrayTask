package org.example.entity.impl;

import org.example.entity.CarPart;

public class Frame implements CarPart {
    private final String partName = "Кузов";

    @Override
    public String getPurpose() {
        return "Я корпус машины, я держу все детали вместе";
    }

    public String getPartName() {
        return partName;
    }
}
