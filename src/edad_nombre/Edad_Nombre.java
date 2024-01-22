/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edad_nombre;
import java.util.Scanner;
/**
 *
 * @author JUAN CARLOS
 */
public class Edad_Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int edad;
         String Nombre;
        
      Scanner entrada = new Scanner(System.in);        
        System.out.println("Escribe tu edad: ");        
        edad=entrada.nextInt();
        
        
        System.out.println("escribe tu Nombre"); 
        Nombre=entrada.next();
        System.out.println("Tue nombre es "+Nombre +" tiene la edad de "+edad);
        
        
        
    }
    
}
