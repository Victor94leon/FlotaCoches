public class FurgonetaPequena extends VehiculoLigero implements Seguridad
{
    static final int PLAZAS_MAXIMAS = 7;
    /**
     * Constructor for objects of class FurgonetaPequena
     */
    public FurgonetaPequena(int numero, Marcas marca, int antiguedad, int kilometraje, int plazas)
    {
        super(numero,marca,antiguedad,kilometraje,plazas);
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

    /**
     * Devuelve un array de enteros con los datos del vehículo
     */
    public int[] devuelveDatos() {
        int[] datos = new int[4];
        datos[0] = getNumero();
        datos[1] = getAntiguedad();
        datos [2] = getKilometraje();
        datos [3] = getPlazas();
        return datos;
    }
}
