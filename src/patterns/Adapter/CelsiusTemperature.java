package patterns.Adapter;

public class CelsiusTemperature implements Temperature
{
    @Override
    public void printTemperatureMessage()
    {
        System.out.println("Temperature in Celsius");
    }
}
