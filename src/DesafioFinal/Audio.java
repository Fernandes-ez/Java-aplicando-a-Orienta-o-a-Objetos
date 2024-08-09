package DesafioFinal;

public class Audio {
    private String titulo ;
    private int  totalCurtidas, totalReproducoes;
    private int classificacao;

    public void reproduzir(){
        this.totalReproducoes++;
    }

    public void curtir(){
        this.totalCurtidas++;
    }

//  Getters e Setters


    public int getClassificacao() {
        return classificacao;
    }


    public int getTotalReproducoes() {
        return totalReproducoes;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getTotalCurtidas() {
        return totalCurtidas;
    }

}
