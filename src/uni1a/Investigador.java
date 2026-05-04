package uni1a;

/**
 * Clase Investigador representa un investigador que participa en documentales.
 * Relación de ASOCIACIÓN con Documental (ambas clases existen independientemente).
 */
public class Investigador {
    private String nombre;
    private String campoInvestigacion;
    private String institucion;

    // Constructor
    public Investigador(String nombre, String campoInvestigacion, String institucion) {
        this.nombre = nombre;
        this.campoInvestigacion = campoInvestigacion;
        this.institucion = institucion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCampoInvestigacion() {
        return campoInvestigacion;
    }

    public void setCampoInvestigacion(String campoInvestigacion) {
        this.campoInvestigacion = campoInvestigacion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    @Override
    public String toString() {
        return "Investigador{" +
                "nombre='" + nombre + '\'' +
                ", campoInvestigacion='" + campoInvestigacion + '\'' +
                ", institucion='" + institucion + '\'' +
                '}';
    }
}