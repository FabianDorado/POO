package gestioinfovehiculos;

public abstract class Vehiculo { 
    
    private String marca;
    private String modelo;
    private int año;
    private String propietario;
    private String placa;
    
    
    public Vehiculo(String marca, String modelo, int año, String propietario, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.propietario = propietario;
        this.placa = placa;
    }

    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }
    
    public void MostrarInformacion (){
      
       System.out.println("La Marca Es: "+getMarca());
       System.out.println("El Modelo Es. "+getModelo());
       System.out.println("El Año Es: "+getAño());
       System.out.println("El Propietario Es: "+getPropietario());
       System.out.println("La Placa Es: "+getPlaca());
   }
    
    
    
}
