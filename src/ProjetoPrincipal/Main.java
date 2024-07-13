package ProjetoPrincipal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Os Pinguins de Madagascar");
        meuFilme.setAnoDeLancamento(2014);
        meuFilme.setDuracaoEmMinutos(92);

        meuFilme.avalia(5);
        meuFilme.avalia(7);
        meuFilme.avalia(9);

        meuFilme.exibeFichaTecnica();
        System.out.println("Total de avaliações: "+meuFilme.getTotalDeAvaliacoes());
        meuFilme.fichaTecnicaFilme();

        Serie theBoys = new Serie();
        theBoys.setNome("The Boys");
        theBoys.setAnoDeLancamento(2019);
        theBoys.setTemporada(4);
        theBoys.setAtiva(theBoys.isAtiva());
        theBoys.setEpisodioPorTemporada(8);

        theBoys.avalia(9.5);
        theBoys.avalia(10);
        theBoys.avalia(9.7);

        theBoys.exibeFichaTecnica();
        theBoys.fichaTecnicaSerie();
    }
}