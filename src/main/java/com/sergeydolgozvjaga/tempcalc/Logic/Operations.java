package com.sergeydolgozvjaga.tempcalc.Logic;

import java.util.logging.Logger;

/**
* Class describes relations
* between different temperature systems
* */
public class Operations {

    private final Logger logger = Logger.getLogger(String.valueOf(Operations.class));
    private static final int kalvinConst = 273;


    public int kalvinToFahrenheitAll(int kalvin){
        int kalvinToFahrenheitAll = kalvinToFahrenheit(kalvin);
        return kalvinToFahrenheitAll;
    }

    public int celsiusToKalvinAll(int celsius){
        int celsiusToKalvinAll  = celsiusToKalvin(celsius);
        return celsiusToKalvinAll;
    }

    public int fahrenheitToCelsiusAll(int fahrenheit){
        int fahrenheitToCelsiusAll = fahrenheitToCelsius(fahrenheit);
        return fahrenheitToCelsiusAll;
    }

    public int kalvinToCelsiusAll(int kalvin) {
        int kalvinToCelsiusAll = kalvinToCelsius(kalvin);
        return kalvinToCelsiusAll;
    }

    public int fahrenheitToKalvinAll(int fahrenheit) {
        int fahrenheitToKalvinAll = fahrenheitToKalvin(fahrenheit);
        return fahrenheitToKalvinAll;
    }

    public int celsiusToFahrenheitAll(int celsius) {
        int celsiusToFahrenheitAll = celsiusToFahrenheit(celsius);
        return celsiusToFahrenheitAll;
    }


    /**
     * Translate Kalvin to Fahrenheit
     *
     * @return Fahrenheit temperature
     * */
    private int kalvinToFahrenheit(int kalvin) {
        int kalvinToFahrenheit = (int) (1.8 * (kalvin - kalvinConst) + 32);
        return kalvinToFahrenheit;
    }

    /**
     * Translate from Celsius to Kalvin
     *
     * @return Kalvin temperature
     * */
    private int celsiusToKalvin(int celsius) {
        logger.info("start celsiusToKalvin(..)");
        int celsiusToKalvin = celsius + kalvinConst;
        logger.info("exit celsiusToKalvin(..)");
        return celsiusToKalvin;
    }

    /**
     * Translate Fahrenheit to Celsius
     *
     * @return Celsius temperature
     * */
    private int fahrenheitToCelsius(int fahrenheit) {
        logger.info("start fahrenheitToCelsius(..)");
        int fahrenheitToCelsius = (int) ((fahrenheit - 32) / 1.8);
        logger.info("exit fahrenheitToCelsius(..)");
        return fahrenheitToCelsius;
    }

    /**
     * Translate Kalvin to Celsius
     *
     * @return Celsius temperature
     * */
    private int kalvinToCelsius(int kalvin) {
        logger.info("start kalvinToCelsius(..)");
        int kalvinToCelsius = kalvin - kalvinConst;
        logger.info("exit kalvinToCelsius(..)");
        return kalvinToCelsius;
    }

    /**
     * Translate Fahrenheit to Kalvin
     *
     * @return Kalvin temperature
     * */
    private int fahrenheitToKalvin(int fahrenheit) {
        logger.info("start fahrenheitToKalvin(..)");
        int fahrenheitToKalvin = ((5 / 9) * (fahrenheit - 32)) + kalvinConst;
        logger.info("exit fahrenheitToKalvin(..)");
        return fahrenheitToKalvin;
    }

    /**
     * Translate Celsius to Fahrenheit
     *
     * @return Fahrenheit temperature
     * */
    private int celsiusToFahrenheit(int celsius) {
        logger.info("start celsiusToFahrenheit(..)");
        int celsiusToFahrenheit = (int)((1.8 * celsius) + 32);
        logger.info("exit celsiusToFahrenheit(..)");
        return celsiusToFahrenheit;
    }
}
