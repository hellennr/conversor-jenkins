import org.junit.Test;
import static org.junit.Assert.*;

public class ConversorTest {

    Conversor conversor = new Conversor();

    @Test
    public void testFahrenheitParaCelsius() {
        assertEquals(100.0, conversor.fahrenheitParaCelsius(212.0), 0.01);
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32.0), 0.01);
    }

    @Test
    public void testCelsiusParaFahrenheit() {
        assertEquals(212.0, conversor.celsiusParaFahrenheit(100.0), 0.01);
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0.0), 0.01);
    }
}