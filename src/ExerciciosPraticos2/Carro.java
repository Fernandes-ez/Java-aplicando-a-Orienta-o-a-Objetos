package ExerciciosPraticos2;

public class Carro {
    private String modelo;
    private double precoAno1, precoAno2, precoAno3;

    public void defineModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definePreco(double precoAno1,double precoAno2,double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }
    public void exibeInformacoes(){
        System.out.println("Modelo:"+modelo);
        System.out.println("Preço 2020: R$"+precoAno1);
        System.out.println("Preço 2021: R$"+precoAno2);
        System.out.println("Preço 2022: R$"+precoAno3);
        System.out.println("O menor preço foi: R$" + calcularMenorPreco());
        System.out.println("O maior preço foi: R$"+calcularMaiorPreco());
    }
    public double calcularMenorPreco(){
        double menorPreco=precoAno1;

        if (menorPreco>precoAno2){
            menorPreco=precoAno2;
        }
        if (menorPreco>precoAno3){
            menorPreco=precoAno3;
        }
        return menorPreco;
    }
    public double calcularMaiorPreco(){
        double maiorPreco = precoAno1;

        if (maiorPreco<precoAno2){
            maiorPreco=precoAno2;
        }
        if (maiorPreco<precoAno3) {
            maiorPreco=precoAno3;
        }
        return maiorPreco;
    }
}
