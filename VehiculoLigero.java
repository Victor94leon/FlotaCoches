public class VehiculoLigero extends Vehiculo
{
    private int plazas;

    /**
     * Constructor de objetos de la clase VehiculoLigero
     */
    public VehiculoLigero(int numero, Marcas marca, int antiguedad, int kilometraje, int plazas)
    {
        super(numero,marca,antiguedad,kilometraje);
        this.plazas = plazas;
    }
    
    /**
     * Devuelve el número de plazas del vehículo
     */
    public int getPlazas() {
        return plazas;
    }
}

