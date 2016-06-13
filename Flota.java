import java.util.ArrayList;

public class Flota
{
    private ArrayList<Vehiculo> vehiculos;
    private int cochesCreados;

    /**
     * Constructor de objetos de la clase Flota
     */
    public Flota()
    {
        vehiculos = new ArrayList<>();
        cochesCreados = 0;
    }
    
    /**
     * Da de alta un vehiculo
     */
    public void addVehiculo(Vehiculo vehiculo) {
        for(int i = 0; i<cochesCreados; i++) {
            vehiculo.incrementarNumero();
        }
        vehiculos.add(vehiculo);  
        cochesCreados++;
    }
    
    /**
     * Elimina un vehiculo de la colección
     */
    public void removeVehiculo(int id) {
        boolean vehiculoEncontrado = false;
        int i = 0;
        while(i<vehiculos.size() && vehiculoEncontrado) {
            if(vehiculos.get(i).getNumero() == id) {
                vehiculos.remove(i);
                vehiculoEncontrado = true;
            }
            i++;
        }
    }
    
    /**
     * Devuelve la marca con mayor número de vehiculos en la flota
     */
    public Marca marcaMayoritaria() {
        Marca marcaMayoritaria = null;
        if(vehiculos.size()>0) {
            int[] marcas = new int[4];
            for(Vehiculo vehiculoEnLista : vehiculos) {
                if(vehiculoEnLista.getMarca() == Marca.FORD) {
                    marcas[0]++;
                }
                else if(vehiculoEnLista.getMarca() == Marca.OPEL) {
                    marcas[1]++;
                }
                else if(vehiculoEnLista.getMarca() == Marca.CITROEN) {
                    marcas[2]++;
                }
                else if(vehiculoEnLista.getMarca() == Marca.FIAT) {
                    marcas[3]++;
                }
            }
            if(marcas[0] > marcas[1] && marcas[0] > marcas[2] && marcas[0] > marcas[3]) {
                marcaMayoritaria = Marca.FORD;
            }
            else if(marcas[1] > marcas[0] && marcas[1] > marcas[2] && marcas[1] > marcas[3]) {
                marcaMayoritaria = Marca.OPEL;
            }
            else if(marcas[2] > marcas[0] && marcas[2] > marcas[1] && marcas[2] > marcas[3]) {
                marcaMayoritaria = Marca.CITROEN;
            }
            else if(marcas[3] > marcas[0] && marcas[3] > marcas[1] && marcas[3] > marcas[2]) {
                marcaMayoritaria = Marca.FIAT;
            }
        }
        return marcaMayoritaria;
    }
    
    /**
     * Devuelve verdadero si todos los vehiculos cumplen las medidas de seguridad
     */
    public boolean cumplenMedidas() {
        boolean cumplenMedidas = true;
        if(vehiculos.size()>0) {
            for(int i = 0; i<vehiculos.size() && cumplenMedidas; i++) {
                if(!(vehiculos.get(i) instanceof FurgonetaGrande)) {
                    Seguridad vehiculo = ((Seguridad)vehiculos.get(i));
                    if(!vehiculo.cumpleSeguridad()) {
                        cumplenMedidas = false;
                    }
                }
            }
        }
        return cumplenMedidas;
    }
    
    /**
     * Devuelve un array de enteros con todos los datos del vehiculo buscado
     * por parámetro mediante un id
     */
    public int[] getDatosVehiculo(int id) {
        int[] datos = null;
        if(vehiculos.size()>0) {
            boolean cocheEncontrado = false;
            for(int i = 0; i<vehiculos.size() && !cocheEncontrado; i++) {
                if(vehiculos.get(i).getNumero() == id) {
                    datos = vehiculos.get(i).devuelveDatos();
                    cocheEncontrado = true;
                }
            }
        }
        return datos;
    }
}
