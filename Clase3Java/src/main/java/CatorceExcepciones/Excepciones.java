/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CatorceExcepciones;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Excepciones {

    public void  DatosEmpleado(){
        
        try {
            String nombre;
   String apellidos;
   int edad;
   String [] mascotas={"Perro","Gato", "Tortuga"};
   
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Ingrese su nombre");
        nombre=sc.nextLine();
         System.out.println("Ingrese su apelllido");
        apellidos=sc.nextLine();
         System.out.println("Ingrese su edad");
          edad=sc.nextInt();
        
          
          System.out.println("Sus datos son los siguientes");
          System.out.println("Nombres: "+nombre+ "\n");
          System.out.println("Apellidos: "+apellidos+ "\n");
          System.out.println("Edad: "+edad+ "\n");
          System.out.println("Su mascota es "+mascotas[2]+ "\n");
            
        } catch (Exception e) {
           System.out.println("Error:+ "+e.toString() ); 
        }
        finally{
        System.out.println("Se ejecuto el TRY CATCH EN SU TOTALIDAD" );
        }
        
   
    }
   
   
}
