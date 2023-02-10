public abstract class Restaurante {
    /*Clase restaurante, describe lo que va a llevar las otras clases  */
    private String Platillo;
    private String precio;
    private String tipo;

    public String getPlatillo(){
        return Platillo;
    }
    public void setPlatillo(String Platillo){
        this.Platillo= Platillo;
    }
    public String getprecio(){
        return precio;
    }
    public void setprecio(String precio){
        this.precio = precio;
    }
    public String gettipo(){
        return tipo;
    }
    public void settipo(String tipo){
        this.tipo = tipo;
    }
    public void ImprimirOpciones(){};
    
}
