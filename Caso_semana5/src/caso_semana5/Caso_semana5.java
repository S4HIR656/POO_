/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso_semana5;

import java.util.Scanner;

/**
 *
 * @author UCA40422
 */
public class Caso_semana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        C_cliente ctrl = new C_cliente();
        
        String rpta = "s";
        
        while (rpta.equals("s")){
            System.out.println("Ingresa Apellido Paterno: ");
            String Apaterno = sc.nextLine();
            System.out.println("Ingresa Apellido Materno: ");
            String Amaterno = sc.nextLine();
            System.out.println("Ingresa nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingresa tipo de documento: ");
            String t_doc = sc.nextLine();
            System.out.println("Ingresa numero de documento: ");
            int doc = sc.nextInt();
            System.out.println("Ingresa edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingresa correo: ");
            String correo = sc.nextLine();
            System.out.println("Ingresa celular: ");
            int cel = sc.nextInt();
            
            Cliente c = new Cliente();
            
            c.setApaterno(Apaterno);
            c.setAmaterno(Amaterno);
            c.setNombre(nombre);
            c.setT_doc(t_doc);
            c.setDoc(doc);
            c.setEdad(edad);
            c.setCorreo(correo);
            c.setCelular(cel);
            
            System.out.println("¿Desea ingresar mas clientes? (S/N)");
            sc.nextLine();
             rpta = sc.nextLine();
             
             
            ctrl.agregar(c);
   
        }
        
        System.out.println("Lista de clientes");
        ctrl.Mostrar();
        
    } 
}
