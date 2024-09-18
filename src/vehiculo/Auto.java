
package vehiculo;


public class Auto extends Vehiculo{
    private int numeroPuerta;
    
    public Auto(String caballoFuerza, int ruedas, String modelo, String color, String marca, int capacidad, int añoFabrica, int numeroPuerta) {
        super(caballoFuerza, ruedas, modelo, color, marca, capacidad, añoFabrica);
        this.numeroPuerta = numeroPuerta;
    }
    
     @Override
     public void informacion(){
         super.informacion();
         System.out.println("Numero de puertas: " + numeroPuerta);
     }
    
}
