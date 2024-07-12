package ProjetoPrincipal;

public class Filme {
    String nome;
    int anoDeLancamento, duracaoEmMinutos;
    private int totalDeAvaliacoes;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Título:" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        System.out.println("Duração:" + duracaoEmMinutos + " minutos");
        System.out.println("Avaliação:" + somaDasAvaliacoes);
    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    double mediaAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
