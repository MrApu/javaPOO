
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
    public Vehiculo(){
        this.hp = "100";
        this.ruedas = 2;
        this.modelo = "Huracan";
        this.color = "Azul";
        this.marca = "Honda";
        this.capacidad = 2;
        this.añoFabrica = 2024;  
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
}

