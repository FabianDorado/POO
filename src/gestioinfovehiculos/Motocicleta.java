
package gestioinfovehiculos;

public class Motocicleta extends Vehiculo {
    
    private double cilindrada; 

    public Motocicleta(double cilindrada, String marca, String modelo, int año, String propietario, String placa) {
        super(marca, modelo, año, propietario, placa);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override 
  public void MostrarInformacion(){
      System.out.println("El Cilindaje Es: "+getCilindrada());
  }
    
}
