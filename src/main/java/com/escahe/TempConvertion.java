package com.escahe;

public class TempConvertion {

    public static Double convertTemp(Temp from, Double fromValue ,Temp to) {
        switch (from) {
            case Celsius:
                switch (to) {
                    case Fahrenheit:
                        return fromValue*9/5 + 32;
                    case Kelvin:
                        return fromValue+273.15;
                    case Celsius:
                        return fromValue;
                }
            case Fahrenheit:
                switch (to) {
                    case Celsius:
                        return (fromValue-32)*5/9;
                    case Kelvin:
                        return (fromValue-32)*5/9 + 273.15;
                    case Fahrenheit:
                        return fromValue;
                }
            case Kelvin:
                switch (to) {
                    case Fahrenheit:
                        return (fromValue-273.15)*9/5 +32;
                    case Celsius:
                        return fromValue-273.15;
                    case Kelvin:
                        return fromValue;
                }
        }
        return fromValue;
    };

    public enum Temp{
        Celsius,Fahrenheit,Kelvin;
    }

    public static String[] tempArray() {
        String temps = "";
        for (Temp t : Temp.values()) {
            temps+= t.name()+" ";
        }
        return temps.split(" ");
    }


}
