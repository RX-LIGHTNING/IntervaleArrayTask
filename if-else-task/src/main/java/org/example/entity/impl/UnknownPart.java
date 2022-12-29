package org.example.entity.impl;

import org.example.entity.CarPart;

public class UnknownPart implements CarPart {
    private final String partName = "Неизвестно";

    @Override
    public String getPurpose() {
        return "Не знаю такой детали";
    }

    public String getPartName() {
        return partName;
    }
}
