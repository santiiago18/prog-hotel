public class Habitacion {

    private int numero;
    private String tipo;
    private double precioNoche;
    private boolean estaOcupada;


    /**
     * Constructor de Habitacion
     * @param numero numero de la habitacion
     * @param tipo tipo de la habitacion "Suite", "Doble", "Individual"
     * @param precioNoche precio de la noche de la habitacion
     */
    public Habitacion(int numero, String tipo, double precioNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.estaOcupada = false;
    }

    /**
     * Numero de la habitacion
     * @return numero de la habitacion
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Tipo de la habitacion
     * @return tipo de la habitacion
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Precio por noche de la habitacion
     * @return precio de la habitacion
     */
    public double getPrecioNoche() {
        return precioNoche;
    }

    /**
     * Si esta dispoinible o esta ocupadad la habitacion
     * @return true si esta ocupada o true si esta libre
     */
    public boolean getEstaOcupada() {
        return estaOcupada;
    }

    /**
     * Devuelve la representacion textual del hotel con sus atributos
     * @return cadena de texto con todos los atributos
     */
    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append(String.format("Habitacion numero: %d, tipo: %s", numero, tipo));
        s.append(String.format(" precio: %.2f", precioNoche));
        s.append(String.format(" estaOcupada: %b", estaOcupada));

        return s.toString();
    }

}
