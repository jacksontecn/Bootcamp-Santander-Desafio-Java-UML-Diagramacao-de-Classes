package src;

import src.aparelhoTelefone.Phone;
import src.reprodutorMusical.PlayList;
import src.reprodutorMusical.Videos;

public class MainApplication {
    public static void main(String[] args) {
        PlayList playList = new PlayList("Linkin Park","In the end", "Hybrid Theory");
        playList.play();
        playList.pause();
        playList.play();
        playList.aumentarVolume();
        playList.diminuirVolume();
        playList.avançar();

        Videos videos = new Videos();
        videos.addVideo("Megatubarão 2.");
        videos.addVideo("Devolta para o futuro.");

        videos.play();
        System.out.println(videos);

        Phone phone = new Phone();
        phone.addContatos("Aline",81999007890l,"alinemeuamor@email.com");

        phone.atender();
        phone.ligar();
        phone.iniciarCorreioVoz();

    }
}
