package ExerciciosPraticos3;

public class Produto implements Vendavel {
    private double preco, total;
    private int quantidade;
    @Override
    public double calcularPrecoTotal() {
        if (quantidade>5){
            total = preco * quantidade * 0.1;

        }else {
            total = preco * quantidade * 0.05;
        }
        return total;
    }
}
