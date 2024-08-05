package ExerciciosPraticos2;

public class Gato extends Animal{
    public void arranharCortina(){
        System.out.println("Arranhando");
    }

    @Override
    public void emitirSom() {
        System.out.println("miaumiaumuia");
    }
}
