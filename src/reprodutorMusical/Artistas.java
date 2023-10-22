package src.reprodutorMusical;

public class Artistas {

    private String nomeArtista;
    private String nomeMusica;
    private String album;

    public Artistas(String nomeArtista, String nomeMusica, String album) {
        this.nomeArtista = nomeArtista;
        this.nomeMusica = nomeMusica;
        this.album = album;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Artistas{" +
                "nomeArtista='" + nomeArtista + '\'' +
                ", nomeMusica='" + nomeMusica + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}
