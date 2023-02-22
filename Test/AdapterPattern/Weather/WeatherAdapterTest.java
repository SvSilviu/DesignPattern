package AdapterPattern.Weather;

import org.junit.jupiter.api.Test;

class WeatherAdapterTest {

    @Test
    void test() {

        WeatherProgram weatherProgram = new WeatherProgram(70, 65, 113);
        WeatherAPI weatherAPI = new WeatherAdapter(weatherProgram);

        System.out.println("Temperature - " + weatherAPI.getTemperature());
        System.out.println("Humidity - " + weatherAPI.getHumidity());
        System.out.println("Pressure - " + weatherAPI.getPressure());

//        In this example, the client wants to use the WeatherAPI interface to retrieve weather information.
//        However, the WeatherAdapter returns the data in a format that the client cannot use directly.
//        The WeatherAdapter class acts as an adapter between the WeatherProgram and the client, converting the data from the third-party API into the desired format for the client.
//        The client uses the WeatherAPIAdapter as if it were a WeatherAPI implementation, and the adapter handles the conversion of the data behind the scenes.
    }

}