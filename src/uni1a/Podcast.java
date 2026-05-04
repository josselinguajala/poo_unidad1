package uni1a;


public class Podcast extends ContenidoAudiovisual {
    private int numeroEpisodios;
    private String plataforma;
    private String presentador;

    // Constructor
    public Podcast(String titulo, String genero, int año, int numeroEpisodios, String plataforma, String presentador) {
        super(titulo, año, genero);
        this.numeroEpisodios = numeroEpisodios;
        this.plataforma = plataforma;
        this.presentador = presentador;
    }

    // Getters y Setters
    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    // Método específico de Podcast
    public void reproducirEpisodio(int episodio) {
        System.out.println("Reproduciendo episodio " + episodio + " del podcast '" + getTitulo() + "' en " + plataforma);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== PODCAST ===");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Género: " + getGenero());
        System.out.println("Año: " + getAño());
        System.out.println("Episodios: " + numeroEpisodios);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Presentador: " + presentador);
        System.out.println();
    }

    private String getAño() {
		return null;
	}

	@Override
    public String toString() {
        return "Podcast{" +
                "id=" + getId() +
                ", titulo='" + getTitulo() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", año=" + getAño() +
                ", numeroEpisodios=" + numeroEpisodios +
                ", plataforma='" + plataforma + '\'' +
                ", presentador='" + presentador + '\'' +
                '}';
    }
}