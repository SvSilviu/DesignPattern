package AdapterPattern.Weather;

public class WeatherAdapter implements WeatherAPI {

    private WeatherProgram weatherProgram;

    public WeatherAdapter(WeatherProgram weatherProgram) {
        this.weatherProgram = weatherProgram;
    }

    public double getTemperature() {
        return (weatherProgram.getTemperature() - 32) * 5 / 9;
    }

    public double getHumidity() {
        return weatherProgram.getHumidity();
    }

    public double getPressure() {
        return weatherProgram.getPressure() * 0.750062;
    }
}
