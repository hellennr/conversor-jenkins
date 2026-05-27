public class Conversor {

    public double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public double celsiusParaFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }
