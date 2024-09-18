
package vehiculo;


public class Principal {
    public static void main(String[] args) {
         //instanciar = invocar = llamar a un objeto
         
         Moto moto = new Moto("1500",2,"cj huracan","Rojo","Toyota",4,2025);
         //moto.encender();
         //moto.transportar();
         //moto.frenar();
         //moto.acelerar();
         //moto.asegurar();
         //moto.combustionar();
         moto.informacion();
         
         Moto moto1 = new Moto("1900",2,"dfn","azul","hyundai",4,2023);
         //moto1.encender();
         //moto1.transportar();
         //moto1.frenar();
         //moto1.acelerar();
         //moto1.asegurar();
         //moto1.combustionar();
         moto1.informacion();
         
         Auto auto = new Auto("9000",4,"TGH","Negro","Lamborgini",4,2025,6);
         
         auto.informacion();
    } 
    
}
 