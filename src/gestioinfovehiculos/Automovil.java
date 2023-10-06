package gestioinfovehiculos;

public class Automovil extends Vehiculo {
    
    private int NumeroPuertas;

    public Automovil(int NumeroPuertas, String marca, String modelo, int año, String propietario, String placa) {
        super(marca, modelo, año, propietario, placa);
        this.NumeroPuertas = NumeroPuertas;
    }

    public int getNumeroPuertas() {
        return NumeroPuertas;
    }

    public void setNumeroPuertas(int NumeroPuertas) {
        this.NumeroPuertas = NumeroPuertas;
    }
    
 @Override 
   public void MostrarInformacion (){
       System.out.println("El Numero De Puertas Es: "+getNumeroPuertas());
   }
    
    
    
    
    
    
}
