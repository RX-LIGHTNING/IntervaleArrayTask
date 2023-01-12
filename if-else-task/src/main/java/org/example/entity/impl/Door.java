package org.example.entity.impl;

import org.example.entity.CarPart;

public class Door implements CarPart {
    private String partName;

    public Door(String partName) {
        this.partName = partName;
    }

    @Override
    public String getPurpose() {
        return "Я дверь машины, я вам не дам выйти!";
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }
}
