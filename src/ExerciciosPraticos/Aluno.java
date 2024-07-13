package ExerciciosPraticos;

public class Aluno {
    private String nome;
    public int idade;
    private int totalDeNotas;
    private double somaDasNotas;

    void FichaTecnica(){
        System.out.println("Nome: "+nome+"\nIdade: "+idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void darNota(double nota){
        somaDasNotas+=nota;
        totalDeNotas++;
    }

    public int getTotalDeNotas() {
        return totalDeNotas;
    }

    double calculaMedia(){
        return somaDasNotas/totalDeNotas;
    }
}
