public enum Marcas
{
    FORD("Ford"),
    OPEL("Opel"),
    CITROEN("Citroen"),
    FIAT("Fiat");
    
    private String marca;
    
    private Marcas(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }
}
