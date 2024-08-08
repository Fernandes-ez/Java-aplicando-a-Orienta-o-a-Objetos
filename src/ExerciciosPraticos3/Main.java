package ExerciciosPraticos3;

public class Main {
    public static void main(String[] args) {
        ConversorDeMoeda conversor = new ConversorDeMoeda();
        conversor.converterDolarParaReal(7);

        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
        sala.calcularArea(2,3);
        sala.calcularPerimetro(2,3);

        TabuadaMultiplicacao tabu = new TabuadaMultiplicacao();
        tabu.mostrarTabuada(5);

        ConversorDeTemperaturaPadrao convert = new ConversorDeTemperaturaPadrao();
        convert.celsiusParaFarenheit(8);
        convert.farenheitParaCelsius(77);
    }
}
