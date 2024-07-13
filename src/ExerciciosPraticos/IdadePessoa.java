package ExerciciosPraticos;

public class IdadePessoa {
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void verificacao(){
        if (idade>18){
            System.out.println("Acesso permitido");
        }else {
            System.out.println("Acesso negado");
        }
    }
}
