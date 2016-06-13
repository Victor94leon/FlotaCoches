public class Vehiculo
{
    private int numero;
    private String marca;
    private int antiguedad;
    private int kilometraje;
    
    /**
     * Constructor de objetos de la clase Vehiculo
     */
    public Vehiculo(int numero, String marca, int antiguedad, int kilometraje)
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
    public String getMarca() {
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
