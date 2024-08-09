package DesafioFinal;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() > 8){
            System.out.println(audio.getTitulo() + ", sucesso atual!");
        }else {
            System.out.println(audio.getTitulo() + " ,uma ótima opção!");
        }

    }
}
