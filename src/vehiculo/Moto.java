
package vehiculo;


public class Moto extends Vehiculo{
    
    public Moto(String caballoFuerza,int ruedas, String modelo, String color, String marca,int capacidad,int añoFabrica){
        super(caballoFuerza,ruedas,modelo,color,marca,capacidad,añoFabrica);
    
    }
    
    public void frenar(){
        System.out.println("La moto frena");
    }
    
    public void acelerar () {
        System.out.println("La moto acelera rapidamente");
    }
    
    public void combustionar () {
        System.out.println("La moto combustiona gasolina");
    }
    
    public void asegurar () {
        System.out.println("La moto asegura la vida del motociclista");
    }
}
