package ProjetoPrincipal;

import CALCULOS.CalculadoraDeTempo;

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

        Filme avatar = new Filme();
        avatar.setNome("Avatar");
        avatar.setAnoDeLancamento(2012);
        avatar.setDuracaoEmMinutos(200);



        Serie theBoys = new Serie();
        theBoys.setNome("The Boys");
        theBoys.setAnoDeLancamento(2019);
        theBoys.setTemporada(2);
        theBoys.setAtiva(true);
        theBoys.setEpisodioPorTemporada(8);
        theBoys.setMinutosPorEp(60);


        theBoys.avalia(9.5);
        theBoys.avalia(10);
        theBoys.avalia(9.0);

        theBoys.exibeFichaTecnica();
        theBoys.fichaTecnicaSerie();
        System.out.println("Tempo de maratona:"+theBoys.getDuracaoEmMinutos());

        CalculadoraDeTempo calcladora = new CalculadoraDeTempo();
        calcladora.inclui(meuFilme);
        calcladora.inclui(avatar);
        calcladora.inclui(theBoys);
        System.out.println(calcladora.getTempoTotal());

    }
}