package src.reprodutorMusical;

import src.controlador.ControladorDigital;

import java.util.ArrayList;
import java.util.List;

public class Videos implements ControladorDigital {
    private List<String> nome;
    private boolean statusPause;

    public Videos() {
        this.nome = new ArrayList<>();
        statusPause = false;
    }

    public void addVideo(String nome){
        this.nome.add(nome);
    }

    public List<String> getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Videos{" +
                "nome=" + nome +
                '}';
    }

    @Override
    public void retroceder() {
        System.out.println("Retrocedendo Video.");
    }

    @Override
    public void play() {

        if (statusPause){
            System.out.println("Retornando da Pausa.");
        }else {
            System.out.println("Iniciando Video.");
        }

    }

    @Override
    public void pause() {
        this.statusPause = true;
        System.out.println("Video pausado.");

    }

    @Override
    public void avançar() {
        System.out.println("Avançando video.");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando o volume.");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Baixando o volume;");
    }
}
