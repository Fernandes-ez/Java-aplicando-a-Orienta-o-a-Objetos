package ExerciciosPraticos;

public class Carro {
    String modelo,cor;
    int ano;

    void FichaTecnica(){
        System.out.println("Modelo: "+modelo+"\nAno: "+ano+"\nCor: "+cor+"\nIdade: "+(2024-ano));
    };
}
