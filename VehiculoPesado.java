public abstract class VehiculoPesado extends Vehiculo
{
    private float pesoMedio;

    /**
     * Constructor de objetos de la clase VehiculoPesado
     */
    public VehiculoPesado(int numero, Marcas marca, int antiguedad, int kilometraje, float pesoMedio)
    {
        super(numero,marca,antiguedad,kilometraje);
        this.pesoMedio = pesoMedio;
    }

    /**
     * Devuelve el peso medio del vehículo
     */
    public float getPesoMedio() {
        return pesoMedio;
    }

    /**
     * Devuelve un array de enteros con los datos del vehículo
     */
    public abstract int[] devuelveDatos();
}
