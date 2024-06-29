public class Main {
    public static void main(String[] args) {
        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta("Punto A", "Punto B");

        // Cambiar a otra estrategia
        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("Punto A", "Punto B");

        // Cambiar a otra estrategia
        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("Punto A", "Punto B");

        // Cambiar a la estrategia de ruta sin peajes
        gps.setRutaStrategy(new RutaSinPeajes());
        gps.calcularRuta("Punto A", "Punto B");
    }
}
