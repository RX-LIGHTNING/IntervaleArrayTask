package org.example.entity.impl;

import org.example.entity.CarPart;

public class Wheel implements CarPart {
    private String partName;

    public Wheel(String partName) {
        this.partName = partName;
    }

    @Override
    public String getPurpose() {
        return "Я колесо, я двигаю автомобиль вперед";
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }
}
