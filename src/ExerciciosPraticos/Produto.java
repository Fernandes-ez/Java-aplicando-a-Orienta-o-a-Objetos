package ExerciciosPraticos;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    void desconto(){
        if (preco>100){
            preco -=(preco*0.1);
            System.out.println("Desconto de 10% aplicado!");
        }else {
            System.out.println("O desconto não se aplica para esse produto.");
        }
    }
    void exibirAtributos(){
        System.out.println("Produto: "+nome);
        System.out.println("Preço: "+preco);
    }


}
