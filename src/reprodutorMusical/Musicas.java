package src.reprodutorMusical;

import src.controlador.ControladorDigital;

public class Musicas implements ControladorDigital {

    private Artistas artistas;
    private boolean statusMusica;

    public Musicas(Artistas artistas) {
        this.artistas = artistas;
        this.statusMusica = false;
    }

    @Override
    public void retroceder() {
        System.out.println("Voltar música.");

    }

    @Override
    public void play() {
        if (statusMusica){
            System.out.println("Retomando a música " + artistas.getNomeMusica());

        }else {

            System.out.println("Tocando música " + artistas.getNomeMusica() + " do(a) musico/banda " + artistas.getNomeArtista()+".");
        }
    }

    @Override
    public void pause() {
        statusMusica = true;
        System.out.println("Pausando a música.");

    }

    @Override
    public void avançar() {
        System.out.println("Pulando a música.");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume da música.");

    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo volume da música.");
    }
}
