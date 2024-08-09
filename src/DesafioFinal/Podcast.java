package DesafioFinal;

public class Podcast extends Audio{
    private String host, canal;

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas()>200){
            return 10;
        }else {
            return 8;
        }
    }





//    Getters e Setters

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }
}
