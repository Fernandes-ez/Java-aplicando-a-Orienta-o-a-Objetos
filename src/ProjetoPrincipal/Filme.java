package ProjetoPrincipal;

public class Filme extends Titulo{

    private String dirtetor;

    public String getDirtetor() {
        return dirtetor;
    }

    public void setDirtetor(String dirtetor) {
        this.dirtetor = dirtetor;
    }

    public void exibeFichaTecnica(){
        System.out.println("Título:" + getNome()+"\nAno de lançamento:" + getAnoDeLancamento()+"\nAvaliação:" + mediaAvaliacoes()+"\nDiretor:"+dirtetor+"\nDuração em minutos: "+getDuracaoEmMinutos()+" minutos");
    }
}