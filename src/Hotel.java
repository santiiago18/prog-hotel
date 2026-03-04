public class Hotel {

    private Habitacion[] inventario;
    private final int MAX_HABITACIONES;

    public Hotel (int numero_maximo_de_habitaciones){
        MAX_HABITACIONES = numero_maximo_de_habitaciones;
        inventario = new Habitacion[MAX_HABITACIONES];

    }

    public Habitacion buscarHabitaciones(int numero){
        Habitacion habitacionEncontrada = null;
        boolean seguirBuscando = true;

        for (int i = 0; i<MAX_HABITACIONES && seguirBuscando; i++){
            if(inventario[i].getNumero() == numero){
                habitacionEncontrada = inventario[i];
                seguirBuscando = false;
            }
        }
        return habitacionEncontrada;
    }


}
