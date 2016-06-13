public abstract class VehiculoPesado extends Vehiculo
{
    private int pesoMedio;

    /**
     * Constructor de objetos de la clase VehiculoPesado
     */
    public VehiculoPesado(Marca marca, int antiguedad, int kilometraje, int pesoMedio)
    {
        super(marca,antiguedad,kilometraje);
        this.pesoMedio = pesoMedio;
    }

    /**
     * Devuelve el peso medio del vehículo
     */
    public int getPesoMedio() {
        return pesoMedio;
    }

    /**
     * Devuelve un array de enteros con los datos del vehículo
     */
    public abstract int[] devuelveDatos();
}
