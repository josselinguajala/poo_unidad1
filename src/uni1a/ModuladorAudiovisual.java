package uni1a;

public class ModuladorAudiovisual {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CONTENIDO AUDIOVISUAL ===\n");

        // 1. COMPOSICIÓN: SerieDeTV y Temporada
        System.out.println("--- COMPOSICIÓN: SerieDeTV y Temporada ---");
        SerieDeTV serie = new SerieDeTV("The Crown", 60, "Drama histórico", 4);
        Temporada temp1 = new Temporada(1, 10, 2016);
        Temporada temp2 = new Temporada(2, 10, 2017);
        Temporada temp3 = new Temporada(3, 10, 2019);
        
        serie.agregarTemporada(temp1);
        serie.agregarTemporada(temp2);
        serie.agregarTemporada(temp3);
        
        serie.mostrarDetalles();
        System.out.println("Temporadas de la serie: " + serie.getTemporadas());
        System.out.println("Primera temporada: " + serie.getTemporadas());
        System.out.println();

        // 2. AGREGACIÓN: Pelicula y Actor
        System.out.println("--- AGREGACIÓN: Pelicula y Actor ---");
        Pelicula pelicula = new Pelicula("Inception", null, 148, "Ciencia ficción", "Christopher Nolan");
        
        Actor actor1 = new Actor("Leonardo DiCaprio", 49, "Estadounidense");
        Actor actor2 = new Actor("Joseph Gordon-Levitt", 43, "Estadounidense");
        
        pelicula.agregarActor(actor1, null);
        pelicula.agregarActor(actor2, null);
        
        pelicula.mostrarDetalles();
        System.out.println("Actores en la película: " + pelicula.getActor());
        System.out.println("Actor 1: " + pelicula.getActor());
        System.out.println("Actor 2: " + pelicula.getActor());
        System.out.println();

        // 3. ASOCIACIÓN: Documental e Investigador
        System.out.println("--- ASOCIACIÓN: Documental e Investigador ---");
        Documental documental = new Documental("Our Planet", 50, "Naturaleza", "David Attenborough");
        
        Investigador investigador1 = new Investigador("Maria Gomez", "Biologia Marina", "Universidad de Barcelona");
        Investigador investigador2 = new Investigador("Carlos Ruiz", "Ecología", "CSIC");
        
        documental.agregarInvestigador(investigador1);
        documental.agregarInvestigador(investigador2);
        
        documental.mostrarDetalles();
        System.out.println("Investigadores: " + documental.getInvestigadores().size());
        System.out.println("Investigador 1: " + documental.getInvestigadores().get(0).getNombre());
        System.out.println("Investigador 2: " + documental.getInvestigadores().get(1).getNombre());
        System.out.println();

        // 4. NUEVAS SUBCLASES
        System.out.println("--- NUEVAS SUBCLASES ---");
        
        Podcast podcast = new Podcast("The Daily", "Noticias", 2020, 1500, "Spotify", "Michael Barbaro");
        podcast.mostrarDetalles();
        podcast.reproducirEpisodio(42);
        System.out.println();
        
        VideoMusical video = new VideoMusical("Blinding Lights", "Pop", 2019, "The Weeknd", "XO Records", 203);
        video.mostrarDetalles();
        System.out.println("Duración formateada: " + video.obtenerDuracionFormateada());
        System.out.println();

        // 5. POLIMORFISMO
        System.out.println("--- POLIMORFISMO (ContenidoAudiovisual) ---");
        
        ContenidoAudiovisual contenido1 = new Pelicula("Interstellar", null, 169, "Ciencia ficción", "Christopher Nolan");
        ContenidoAudiovisual contenido2 = new Podcast("Radio Ambulante", "Narrativa", 2012, 200, "NPR", "Daniel Alarcón");
        ContenidoAudiovisual contenido3 = new VideoMusical("Bad Guy", "Electro pop", 2019, "Billie Eilish", "Interscope", 194);
        
        System.out.println("Contenido 1: " + contenido1.getTitulo());
        System.out.println("Contenido 2: " + contenido2.getTitulo());
        System.out.println("Contenido 3: " + contenido3.getTitulo());
        System.out.println();

        System.out.println("=== SISTEMA FUNCIONAL COMPLETADO CON ÉXITO ===");
    }
}
