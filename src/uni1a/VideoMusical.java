package uni1a;


public class VideoMusical extends ContenidoAudiovisual {
    private String artista;
    private String selloDiscografico;
    private int duracionSegundos;

    // Constructor
    public VideoMusical(String titulo, String genero, int año, String artista, String selloDiscografico, int duracionSegundos) {
        super(titulo, año, genero);
        this.artista = artista;
        this.selloDiscografico = selloDiscografico;
        this.duracionSegundos = duracionSegundos;
    }

    // Getters y Setters
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getSelloDiscografico() {
        return selloDiscografico;
    }

    public void setSelloDiscografico(String selloDiscografico) {
        this.selloDiscografico = selloDiscografico;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    // Método específico de VideoMusical
    public String obtenerDuracionFormateada() {
        int minutos = duracionSegundos / 60;
        int segundos = duracionSegundos % 60;
        return minutos + ":" + (segundos < 10 ? "0" + segundos : segundos);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== VIDEO MUSICAL ===");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Género: " + getGenero());
        System.out.println("Año: " + getAño());
        System.out.println("Artista: " + artista);
        System.out.println("Sello: " + selloDiscografico);
        System.out.println("Duración: " + obtenerDuracionFormateada());
        System.out.println();
    }

    @Override
    public String toString() {
        return "VideoMusical{" +
                "id=" + getId() +
                ", titulo='" + getTitulo() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", año=" + getAño() +
                ", artista='" + artista + '\'' +
                ", selloDiscografico='" + selloDiscografico + '\'' +
                ", duracionSegundos=" + duracionSegundos +
                '}';
    }

	private String getAño() {
		// TODO Auto-generated method stub
		return null;
	}
}
