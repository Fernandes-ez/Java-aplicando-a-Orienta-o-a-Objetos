package ExerciciosPraticos2;

public class Main {
    public static void main(String[] args) {
        Carro lancer = new Carro();
        lancer.defineModelo("Lancer");
        lancer.definePreco(120000, 100000, 110000);
        lancer.calcularMenorPreco();
        lancer.exibeInformacoes();

        Cachorro carol = new Cachorro();
        carol.emitirSom();
        carol.abanarRabo();

        Cachorro bruce = new Cachorro();
        bruce.abanarRabo();
        bruce.emitirSom();

        Gato lara = new Gato();
        lara.arranharCortina();
        lara.emitirSom();

    }
}
