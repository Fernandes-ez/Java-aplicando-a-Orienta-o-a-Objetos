package ExerciciosPraticos3;

public class ProdutoFisico extends Livro implements Calculavel{
    private double preco;
    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
}
