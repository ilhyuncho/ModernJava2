package Headfirst.Observer;

public class ObserverMain {
    public static void main(String[] args) {



        WeatherData weatherData = new WeatherData();

        CurrentConditionDisply currentDisplay = new CurrentConditionDisply(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,65,30.4f);
        weatherData.setMeasurements(80,65,30.4f);
    }
}
