package ExerciciosPraticos;

public class Teste {
    public static void main(String[] args) {
        Pessoa cleber = new Pessoa();
        System.out.println(cleber.texto);

        Calculadora calc = new Calculadora();
        System.out.println(calc.dobro(5));

        Musica CamisetaConfortavel = new Musica();
        CamisetaConfortavel.nome = "Camiseta Confortável";
        CamisetaConfortavel.artista = "MC Igu";
        CamisetaConfortavel.anoLancaomento = "2018";


        CamisetaConfortavel.avalia(10);
        CamisetaConfortavel.avalia(9);
        CamisetaConfortavel.avalia(8);

        CamisetaConfortavel.FichaTecnica();

        Carro PorschePanamera = new Carro();
        PorschePanamera.modelo = "Porsche Panamera";
        PorschePanamera.ano = 2019;
        PorschePanamera.cor = "Preto";

        PorschePanamera.FichaTecnica();

        Aluno cleriton = new Aluno();
        cleriton.setNome("Cleriton");
        cleriton.idade = 20;
        cleriton.darNota(8);
        cleriton.darNota(9.5);
        cleriton.darNota(5.3);
        cleriton.FichaTecnica();
        System.out.println("Média final: "+cleriton.calculaMedia());
    }
}
