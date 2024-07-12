package ExerciciosPraticos;

public class Musica {
    String nome, artista, anoLancaomento;
    double avaliacao, somaDasAvaliacoes;
    int numeroDeAvaliacoes;
    void FichaTecnica(){
        System.out.println("Título:"+nome+"\nArtista:"+artista+"\nAno de lançamento:"+anoLancaomento+"\nAvaçiação:"+mediaAvaliacoes());    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        numeroDeAvaliacoes++;
    }
    double mediaAvaliacoes(){
        return somaDasAvaliacoes / numeroDeAvaliacoes;
    }
}
