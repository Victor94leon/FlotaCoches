public class Camion extends VehiculoPesado implements Seguridad
{
    static final float PESO_MAX_ARTICULADO = 3000F;
    static final float PESO_MAX_NO_ARTICULADO = 2000F;
    
    /**
     * Constructor for objects of class Camion
     */
    public Camion(int numero, Marcas marca, int antiguedad, int kilometraje, float pesoMedio)
    {
        super(numero,marca,antiguedad,kilometraje,pesoMedio);
    }

    /**
     * Devuelve true si es un camión articulado o
     * false en caso contrario
     */
    public boolean esArticulado() {
        boolean esArticulado = false;
        if(getMarca() == Marcas.FIAT || getMarca() == Marcas.FORD) {
            esArticulado = true;
        }
        return esArticulado;
    }

    /**
     * Devuelve true si cumple los requisitos de seguridad y false
     * en caso contrario
     */
    public boolean cumpleSeguridad() {
        boolean cumpleSeguridad = false;
        if((esArticulado() && getPesoMedio() <= PESO_MAX_ARTICULADO) || (!esArticulado() && getPesoMedio() <= PESO_MAX_NO_ARTICULADO)) {
            cumpleSeguridad = true;
        }
        return cumpleSeguridad;
    }
}
