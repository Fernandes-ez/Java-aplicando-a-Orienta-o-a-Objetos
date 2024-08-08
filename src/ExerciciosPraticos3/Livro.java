package ExerciciosPraticos3;

public class Livro implements Calculavel{
    private double preco;
    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
