public class Coche extends VehiculoLigero implements Seguridad
{
    static final int PLAZAS_MAXIMAS = 5;
    /**
     * Constructor de objetos de la clase Coche
     */
    public Coche(int numero, Marcas marca, int antiguedad, int kilometraje, int plazas)
    {
        super(numero,marca,antiguedad,kilometraje,plazas);
    }
    
    /**
     * Devuelve cada cuantos años tiene que pasar la revisión
     */
    public int revision() {
        int periodoDeRevision = 1;
        if (getMarca()==Marcas.OPEL) {
            periodoDeRevision = 2;
        }
        return periodoDeRevision;
    }
    
    /**
     * Devuelve true si cumple los requisitos de seguridad y false
     * en caso contrario
     */
    public boolean cumpleSeguridad() {
        boolean cumpleSeguridad = false;
        if(getPlazas()<=PLAZAS_MAXIMAS) {
            cumpleSeguridad = true;
        }
        return cumpleSeguridad;
    }
}
