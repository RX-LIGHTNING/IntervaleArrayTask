package org.example;

import org.example.entity.CarPart;
import org.example.entity.impl.Door;
import org.example.entity.impl.Frame;
import org.example.entity.impl.UnknownPart;
import org.example.entity.impl.Wheel;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

public class Main {
    /**
     * Здесь мы пытаемся достать из списка автомобильных деталей строку, где описано назначение этой детали.
     */

    static List<CarPart> carParts = Arrays.asList(new Door(),new Frame(), new Wheel());
    static Map<String, CarPart> map = carParts.stream().collect(toMap(CarPart::getPartName, Function.identity()));
    public String purposeByIf(String variant) {
        if (variant.equals("Дверь")) {
            return new Door().getPurpose();
        } else if (variant.equals("Колесо")) {
            return new Wheel().getPurpose();
        } else if (variant.equals("Кузов")) {
            return new Frame().getPurpose();
        } else return "Не знаю такой детали";
    }

    public String purposeBySwitch(String variant) {
        switch (variant) {
            case "Дверь":
                return new Door().getPurpose();
            case "Колесо":
                return new Wheel().getPurpose();
            case "Кузов":
                return new Frame().getPurpose();
            default:
                return "Не знаю такой детали";
        }
    }
    public String purposeByMap(String variant) {
        return map.getOrDefault(variant,new UnknownPart()).getPurpose();
    }

    public static void main(String[] args) {
        //Заполнение списка, ввиду отстутствия спринга
    }
}