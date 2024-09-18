
package vehiculo;

//Mi objeto vehículo
//Autor: José Bernedo
public class Vehiculo {
    //Caracteristicas = Atributos = Variables
    private String hp;
    private int ruedas;
    private String modelo;
    private String color;
    private String marca;
    private int capacidad;
    private int añoFabrica;
    private boolean encendido;
    
    //Constructor - Inicializar
    public Vehiculo(String caballoFuerza,int ruedas, String modelo, String color, String marca,int capacidad,int añoFabrica){
        this.hp = caballoFuerza;
        this.ruedas = ruedas;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.capacidad = capacidad;
        this.añoFabrica = añoFabrica;
    }
    
    

    
    
    
    //Metodos o Funcion
    public void transportar() {
        System.out.println("El vehiculo esta en transporte");
    }
    
    //
    public void encender() {
        System.out.println("Vehiculo encendido");
        this.encendido = true;
    }
    
    public void informacion () {
        System.out.println("El vehiculo tiene " + hp + "caballos de fuerza");
        System.out.println("Tambien tiene " + ruedas + "ruedas" );
        System.out.println("El modelo es un " + modelo);
        System.out.println("El color es " + color);
        System.out.println("La marca es " + marca);
        System.out.println("Tiene una capacidad de " + capacidad + "cilindros" );
        System.out.println("El año de su creacion es de " + añoFabrica);
    }
}

