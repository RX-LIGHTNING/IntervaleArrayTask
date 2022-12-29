package org.example.entity.impl;

import org.example.entity.CarPart;

public class Door implements CarPart {
    private final String partName = "Дверь";

    @Override
    public String getPurpose() {
        return "Я дверь машины, я вам не дам выйти!";
    }

    public String getPartName() {
        return partName;
    }
}
