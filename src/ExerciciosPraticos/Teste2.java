package ExerciciosPraticos;

public class Teste2 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroDaConta(1504);
        conta.setSaldo(1000.0);
        conta.titular = "Cleriton";

        System.out.println("Titular: "+conta.titular);
        System.out.println("Número da conta: "+conta.getNumeroDaConta());
        System.out.println("Saldo: "+conta.getSaldo());

        IdadePessoa cleriton = new IdadePessoa();
        cleriton.setNome("Cleriton Savio");
        cleriton.setIdade(10);
        System.out.println("Nome: "+cleriton.getNome());
        cleriton.verificacao();

        Produto lhama = new Produto();
        lhama.setNome("Lhama");
        lhama.setPreco(80);

        lhama.desconto();
        lhama.exibirAtributos();
        Livro mandrakaDoMomento = new Livro();
        mandrakaDoMomento.setTitulo("Mandraka do Momento");
        mandrakaDoMomento.setAutor("Kyan, Vulgo FK, Yunk Vino, Toledo, Nagalli, Bvga Beatz");
        mandrakaDoMomento.exibeFichaTecnica();
    }

}
