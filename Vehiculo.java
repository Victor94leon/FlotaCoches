public abstract class Vehiculo
{
    private int numero;
    private Marca marca;
    private int antiguedad;
    private int kilometraje;
    
    /**
     * Constructor de objetos de la clase Vehiculo
     */
    public Vehiculo(Marca marca, int antiguedad, int kilometraje)
    {
        this.marca = marca;
        this.antiguedad = antiguedad;
        this.kilometraje = kilometraje;
        numero = 0;
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
    public Marca getMarca() {
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
    
    /**
     * Devuelve un array de enteros con los datos del vehículo
     */
    public abstract int[] devuelveDatos();
    
    /**
     * Incrementa en 1 el número identificador del coche
     */
    public void incrementarNumero(){
        numero++;
    }
}
