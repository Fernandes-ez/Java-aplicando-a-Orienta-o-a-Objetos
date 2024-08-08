package ExerciciosPraticos3;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero) {
        int i = 0;
        do{
            System.out.println(numero + "x" + i + "=" + numero * i);
            i++;
        }while (i <= 10);
        }
}
