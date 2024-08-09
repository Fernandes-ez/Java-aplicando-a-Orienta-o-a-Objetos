package DesafioFinal;

public class Musica extends Audio {
    private String cantor, produtor, album, genero;

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes()>900){
            return 10;
        }else {
            return 8;
        }
    }


//    Getters e Setters

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
