package uni1a;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Actor representa un actor que participa en una o más películas.
 * Relación de AGREGACIÓN con Película (un actor existe independientemente de una película).
 */
public class Actor {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private List<Pelicula> peliculas;

    // Constructor
    public Actor(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.peliculas = new ArrayList<>();
    }

    // Métodos para la agregación: añadir y eliminar películas (sin destruir al actor)
    public void agregarPelicula(Pelicula pelicula) {
        if (pelicula != null && !peliculas.contains(pelicula)) {
            peliculas.add(pelicula);
        }
    }

    public void eliminarPelicula(Pelicula pelicula) {
        peliculas.remove(pelicula);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", peliculas=" + peliculas.size() +
                '}';
    }
}