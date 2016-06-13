public class FurgonetaGrande extends VehiculoPesado
{
    /**
     * Constructor for objects of class Camion
     */
    public FurgonetaGrande(Marca marca, int antiguedad, int kilometraje, int pesoMedio)
    {
        super(marca,antiguedad,kilometraje,pesoMedio);
    }

    /**
     * Devuelve true si es un camión articulado o
     * false en caso contrario
     */
    public boolean esArticulado() {
        boolean esArticulado = false;
        if(getMarca() == Marca.FIAT || getMarca() == Marca.FORD) {
            esArticulado = true;
        }
        return esArticulado;
    }

    /**
     * Devuelve un array de enteros con los datos del vehículo
     */
    public int[] devuelveDatos() {
        int[] datos = new int[4];
        datos[0] = getNumero();
        datos[1] = getAntiguedad();
        datos [2] = getKilometraje();
        datos[3] = getPesoMedio();
        return datos;
    }
}

