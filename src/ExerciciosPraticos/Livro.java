package ExerciciosPraticos;

public class Livro {
    private String titulo,autor;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    void exibeFichaTecnica(){
        System.out.println("Título: "+titulo+"\nAutor: "+autor);
    }
}
