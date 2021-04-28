package display;

import observer.Observer;
import subject.WeatherData;

public class ForecastDisplay implements DisplayElement, Observer {
    private WeatherData weatherData;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update() {
        this.lastPressure = currentPressure;
        this.currentPressure = this.weatherData.getPressure();
        this.display();
    }
}
