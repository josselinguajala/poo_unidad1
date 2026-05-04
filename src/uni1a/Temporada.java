package uni1a;

public class Temporada {
    private int numeroTemporada;
    private int numeroEpisodios;
    private int añoLanzamiento;

    // Constructor
    public Temporada(int numeroTemporada, int numeroEpisodios, int añoLanzamiento) {
        this.numeroTemporada = numeroTemporada;
        this.numeroEpisodios = numeroEpisodios;
        this.añoLanzamiento = añoLanzamiento;
    }

    // Getters y Setters
    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "numeroTemporada=" + numeroTemporada +
                ", numeroEpisodios=" + numeroEpisodios +
                ", añoLanzamiento=" + añoLanzamiento +
                '}';
    }
}
