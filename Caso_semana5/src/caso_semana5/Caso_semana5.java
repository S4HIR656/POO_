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
            try{
            System.out.println("Ingresa Apellido Paterno: ");
            String Apaterno = sc.nextLine();
            System.out.println("Ingresa Apellido Materno: ");
            String Amaterno = sc.nextLine();
            System.out.println("Ingresa nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingresa tipo de documento (DNI / CE): ");
            String t_doc = sc.nextLine();
            System.out.println("Ingresa numero de documento: ");
            String doc = sc.nextLine();
            
            Cliente c = new Cliente();
            c.setT_doc(t_doc);
            c.setDoc(doc); 
        
            System.out.println("Ingresa edad: ");
            int edad = Integer.parseInt(sc.nextLine());
            System.out.println("Ingresa correo: ");
            String correo = sc.nextLine();
            System.out.println("Ingresa celular: ");
            String cel = sc.nextLine();
            String cate; 
            
            if (edad <= 10){
            cate = "Niño";
            }
            else if (edad <= 17 && edad >= 11){
             cate = "Adolescente";
            }
            else {
             cate = "Adulto";
            }
            
            
            c.setApaterno(Apaterno);
            c.setAmaterno(Amaterno);
            c.setNombre(nombre);
            c.setEdad(edad);
            c.setCorreo(correo);
            c.setCelular(cel);
            c.setCate(cate);
          
            ctrl.agregar(c);
            
            System.out.println("¿Desea ingresar mas clientes? (S/N)");
            rpta = sc.nextLine().toLowerCase();}
            
            catch(IllegalArgumentException e){
            
             System.out.println("Error: " + e.getMessage());
             System.out.println("Reiniciando...\n");}
        }
        
        System.out.println("Lista de clientes");
       
        
    } 
}
