public class Vehiculo
{
    private int numero;
    private Marcas marca;
    private int antiguedad;
    private int kilometraje;
    
    /**
     * Constructor de objetos de la clase Vehiculo
     */
    public Vehiculo(int numero, Marcas marca, int antiguedad, int kilometraje)
    {
        this.numero = numero;
        this.marca = marca;
        this.antiguedad = antiguedad;
        this.kilometraje = kilometraje;
    }
    
    /**
     * Devuelve el número identificativo del vehículo
     */
    public int getNumero() {
        return numero;
    }
    
    /**
     * Devuelvela marca del vehículo
     */
    public Marcas getMarca() {
        return marca;
    }
    
    /**
     * Devuelve el año de antigüedad del vehículo
     */
    public int getAntiguedad() {
        return antiguedad;
    }
    
    /**
     * Devuelve el kilometraje del vehículo
     */
    public int getKilometraje() {
        return kilometraje;
    }
}
