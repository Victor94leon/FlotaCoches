public abstract class VehiculoLigero extends Vehiculo
{
    private int plazas;

    /**
     * Constructor de objetos de la clase VehiculoLigero
     */
    public VehiculoLigero(Marca marca, int antiguedad, int kilometraje, int plazas)
    {
        super(marca,antiguedad,kilometraje);
        this.plazas = plazas;
    }

    /**
     * Devuelve el número de plazas del vehículo
     */
    public int getPlazas() {
        return plazas;
    }

    /**
     * Devuelve un array de enteros con los datos del vehículo
     */
    public abstract int[] devuelveDatos();
}

