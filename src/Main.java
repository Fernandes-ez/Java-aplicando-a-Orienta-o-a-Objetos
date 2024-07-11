//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.totalDeAvaliacoes = 0;

        meuFilme.avalia(5);
        meuFilme.avalia(7);
        meuFilme.avalia(9);

        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.mediaAvaliacoes());
    }
}