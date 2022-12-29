package org.example.entity.impl;

import org.example.entity.CarPart;

public class Wheel implements CarPart {
    private final String partName = "Колесо";

    @Override
    public String getPurpose() {
        return "Я колесо, я двигаю автомобиль вперед";
    }

    public String getPartName() {
        return partName;
    }
}
