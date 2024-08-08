package ExerciciosPraticos3;

public class ConversorDeTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFarenheit(double celsius) {
        double farenheit;
        farenheit = (celsius * 9/5) + 32;
        System.out.println("A temperatura em Farenheit é " + farenheit);
    }

    @Override
    public void farenheitParaCelsius(double farenheit) {
        double celsius;
        celsius = (farenheit - 32) * 5/9;
        System.out.println("A temperatura em Celsius é "+ celsius);
    }
}
