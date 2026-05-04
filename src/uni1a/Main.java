package uni1a;


public class Main {

    public static void main(String[] args) {
        // Crear una serie de TV (contenedor)
        SerieDeTV serie = new SerieDeTV("Stranger Things", 50, "Ciencia ficción", 4);

        // Crear temporadas
        Temporada temp1 = new Temporada(1, 8, 2016);
        Temporada temp2 = new Temporada(2, 9, 2017);
        Temporada temp3 = new Temporada(3, 8, 2019);
        Temporada temp4 = new Temporada(4, 9, 2022);

        // Agregar temporadas a la serie
        serie.agregarTemporada(temp1);
        serie.agregarTemporada(temp2);
        serie.agregarTemporada(temp3);
        serie.agregarTemporada(temp4);

        // Mostrar información de la serie
        System.out.println("=== SERIE DE TV ===");
        System.out.println(serie);

        // Mostrar temporadas (corregido)
        System.out.println("\n=== TEMPORADAS (desde la serie) ===");
        System.out.println("Número de temporadas: " + serie.getTemporadas());
        System.out.println("Temporada 1: " + serie.getTemporadas());
        System.out.println("Temporada 2: " + serie.getTemporadas());
        System.out.println("Temporada 3: " + serie.getTemporadas());
        System.out.println("Temporada 4: " + serie.getTemporadas());

        // Eliminar una temporada
        System.out.println("\n=== ELIMINANDO TEMPORADA 2 ===");
        serie.eliminarTemporada(1);  // Elimina el índice 1 (segunda temporada)
        System.out.println("Quedan " + serie.getTemporadas() + " temporadas:");
        System.out.println("Temporada 1: " + serie.getTemporadas());
        System.out.println("Temporada 2 (era la 3): " + serie.getTemporadas());
        System.out.println("Temporada 3 (era la 4): " + serie.getTemporadas());

        // Demostración de composición
        System.out.println("\n=== DEMOSTRACIÓN DE COMPOSICIÓN ===");
        System.out.println("Si la serie 'serie' se elimina (referencia nula),");
        System.out.println("las temporadas asociadas quedarán sin referencias y serán recolectadas.");
    }
}