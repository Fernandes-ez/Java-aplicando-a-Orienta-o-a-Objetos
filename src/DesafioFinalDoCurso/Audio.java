package DesafioFinalDoCurso;

public class Audio {
    private String titulo, cantor, produtor;
    private int tempoEmSegundos, curtidas;

    public void reproduzir(){
        System.out.println("Reproduzindo");
    }

    public void curtir(){
        curtidas += 1;
    }

//  Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public int getTempoEmSegundos() {
        return tempoEmSegundos;
    }

    public void setTempoEmSegundos(int tempoEmSegundos) {
        this.tempoEmSegundos = tempoEmSegundos;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
}
