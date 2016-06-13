public class Coche extends VehiculoLigero
{
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
}
