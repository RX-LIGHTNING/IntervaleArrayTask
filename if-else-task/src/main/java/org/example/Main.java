package org.example;

import org.example.entity.CarPart;
import org.example.entity.impl.Door;
import org.example.entity.impl.Frame;
import org.example.entity.impl.Wheel;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

public class Main {
    /**
     * Здесь мы пытаемся достать из списка автомобильных деталей строку, где описано назначение этой детали.
     */

    private final static String UNKNOWN_PART = "Не знаю такой детали";

    private final CarPart door = new Door("Дверь");
    private final CarPart wheel = new Wheel("Колесо");
    private final CarPart frame = new Frame("Кузов");


    private final List<CarPart> carParts = List.of(door, wheel, frame);
    private final Map<String, CarPart> map = carParts.stream().collect(toMap(CarPart::getPartName, Function.identity()));

    public static void main(String[] args) {

    }

    public String ifPurpose(String variant) {
        String result = "";
        if ("Дверь".equals(variant)) {
            result = door.getPurpose();
        } else if ("Колесо".equals(variant)) {
            result = wheel.getPurpose();
        } else if ("Кузов".equals(variant)) {
            result = frame.getPurpose();
        } else {
            result = UNKNOWN_PART;
        }
        return result;
    }

    public String switchPurpose(String variant) {
        String result = "";
        switch (Optional.ofNullable(variant).orElse("")) {
            case "Дверь":
                result = door.getPurpose();
                break;
            case "Колесо":
                result = wheel.getPurpose();
                break;
            case "Кузов":
                result = frame.getPurpose();
                break;
            default:
                result = "Не знаю такой детали";
                break;
        }

        return result;
    }

    public String mapPurpose(String variant) {
        return Optional.ofNullable(map.get(variant))
                .map(CarPart::getPurpose)
                .orElse(UNKNOWN_PART);
    }
}