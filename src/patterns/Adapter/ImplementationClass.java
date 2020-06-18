package patterns.Adapter;

public class ImplementationClass implements TemperatureAdapter
{
    private Temperature temperature;

    @Override
    public void printTemperatureMessage()
    {
        // we can call some function here that does the conversion and we pass in it
        // as argument the method from the interface that calculates the temperature in Celsius
        // We can implement that method below..
        // for example that could be :  doTheConversion(temperature.calculateTemperatureInCelsius);
        doTheConversion();
    }

    public void doTheConversion()
    {
        System.out.println("I converted the temperature in Kelvin, the result is : \"some value\"");
    }
}
