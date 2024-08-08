package ExerciciosPraticos3;

public class ConversorDeMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.6;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é : R$ "+valorReal);
    }
}
