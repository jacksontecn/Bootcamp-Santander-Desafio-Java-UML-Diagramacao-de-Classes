package src.reprodutorMusical;

import java.util.ArrayList;
import java.util.List;

public class PlayList extends Musicas{
    private List<Musicas> musicasList;

    public PlayList(String nome, String musica, String album) {
        super(new Artistas(nome, musica, album));
        this.musicasList = new ArrayList<>();
    }

    public void addMusica(String nome, String musica, String album){
        musicasList.add(new Musicas(new Artistas(nome,musica,album)));
    }
}
