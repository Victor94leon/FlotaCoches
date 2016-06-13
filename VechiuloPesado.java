public class VechiuloPesado extends Vehiculo
{
    private float pesoMedio;

    /**
     * Constructor de objetos de la clase VehiculoPesado
     */
    public VechiuloPesado(int numero, String marca, int antiguedad, int kilometraje, float pesoMedio)
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
}
