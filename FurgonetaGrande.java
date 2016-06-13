public class FurgonetaGrande extends VehiculoPesado
{
    /**
     * Constructor for objects of class Camion
     */
    public FurgonetaGrande(int numero, Marcas marca, int antiguedad, int kilometraje, float pesoMedio)
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
     * Devuelve un array de enteros con los datos del vehículo
     */
    public int[] devuelveDatos() {
        int[] datos = new int[3];
        datos[0] = getNumero();
        datos[1] = getAntiguedad();
        datos [2] = getKilometraje();
        return datos;
    }
}

