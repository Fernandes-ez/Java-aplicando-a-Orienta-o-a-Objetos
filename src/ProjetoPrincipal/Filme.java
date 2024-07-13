package ProjetoPrincipal;

public class Filme extends Titulo{
    private int duracaoEmMinutos;
    private String dirtetor;

    public String getDirtetor() {
        return dirtetor;
    }

    public void setDirtetor(String dirtetor) {
        this.dirtetor = dirtetor;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    void fichaTecnicaFilme(){
        System.out.println("Duração: "+duracaoEmMinutos+" minutos");
    }


}