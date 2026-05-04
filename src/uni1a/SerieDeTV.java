package uni1a;
import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private List<Temporada> listaTemporadas;

    // Constructor
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporadas = new ArrayList<>();
    }

    
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

	public void agregarTemporada(Temporada temp) {
        if (temp != null) {
            listaTemporadas.add(temp);
        }
    }

    public void eliminarTemporada(int indice) {
        if (indice >= 0 && indice < listaTemporadas.size()) {
            listaTemporadas.remove(indice);
        }
    }

    public List<Temporada> getlistaTemporadas() {
        return listaTemporadas;
    }


	@Override
	public void mostrarDetalles() {
		 System.out.println("Detalles de la película:");
	        System.out.println("ID: " + getId());
	        System.out.println("Título: " + getTitulo());
	        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
	        System.out.println("Género: " + getGenero());
	        System.out.println("Temporadas: " + this.temporadas);
	        System.out.println();
		
	}
}