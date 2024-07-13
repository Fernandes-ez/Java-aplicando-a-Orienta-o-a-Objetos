package ProjetoPrincipal;

public class Serie extends Titulo{
    private int temporada, episodioPorTemporada;
    private boolean ativa;

    public boolean isAtiva() {
        return ativa;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    void fichaTecnicaSerie(){
        System.out.println("Número de temporadas: "+temporada+"\nEpisódios por temporada: "+episodioPorTemporada);
    }

}
