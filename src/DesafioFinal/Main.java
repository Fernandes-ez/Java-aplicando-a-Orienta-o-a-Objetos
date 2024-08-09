package DesafioFinal;

public class Main {
    public static void main(String[] args) {
        Musica getIt = new Musica();
        getIt.setTitulo("Get It");
        getIt.setCantor("Yunk Vino");
        getIt.setAlbum("Meu Amigo Diário 2");
        getIt.setProdutor("BvgaBeats");
        getIt.setGenero("Trap");

        for (int i = 0; i < 1000; i ++);{
            getIt.curtir();
        }
        for (int i = 0; i < 10000; i++){
            getIt.reproduzir();
        }

        Podcast podPah = new Podcast();
        podPah.setHost("Igão e Mítico");
        podPah.setCanal("PodPah!");
        podPah.setTitulo("Ryu, the Runner");

        for (int i = 0; i < 300; i++){
            podPah.reproduzir();
            podPah.curtir();
        }

        MinhasPreferidas minhas = new MinhasPreferidas();
        minhas.inclui(getIt);
        minhas.inclui(podPah);
    }
}
