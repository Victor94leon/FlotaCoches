public enum Marca
{
    FORD("Ford"),
    OPEL("Opel"),
    CITROEN("Citroen"),
    FIAT("Fiat");
    
    private String marca;
    
    private Marca(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }
}
