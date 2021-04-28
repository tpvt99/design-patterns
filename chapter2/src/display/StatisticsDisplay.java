package display;

import subject.WeatherData;
import java.util.ArrayList;
import java.util.Collections;

import observer.Observer;

public class StatisticsDisplay implements DisplayElement, Observer{
    private ArrayList<Float> temperature;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData wD) {
        this.temperature = new ArrayList<>();
        this.weatherData = wD;
        this.weatherData.registerObserver(this);
    }

    public void update() {
        this.temperature.add(weatherData.getTemperature());
        this.display();
    }

    public void display() {
        float maxTemp = Collections.max(this.temperature);
        float minTemp = Collections.min(this.temperature);
        double avgTemp = this.temperature.stream().mapToDouble(a-> a).average().getAsDouble();
        System.out.println("Avg/Max/Min temperature = " + avgTemp + "/" + maxTemp + "/" + minTemp);
    }

}
