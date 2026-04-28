/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_semana5;

/**
 *
 * @author UCA40422
 */
public class Cliente {

        private String Apaterno;
        private String Amaterno;
        private String nombre;
        private String t_doc;
        private int doc;
        private int edad;
        private String correo;
        private int celular;
    
    public String getApaterno() {
        return Apaterno;
    }

    public void setApaterno(String Apaterno) {
        this.Apaterno = Apaterno;
    }

    public String getAmaterno() {
        return Amaterno;
    }

    public void setAmaterno(String Amaterno) {
        this.Amaterno = Amaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getT_doc() {
        return t_doc;
    }

    public void setT_doc(String t_doc) {
        this.t_doc = t_doc;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
 
    public void verdatos(){
        
        System.out.println("Apellidos: "+this.Apaterno+" "+this.Amaterno+
                " Nombre: "+this.nombre+" Tipo de doc: "+this.t_doc+" Número de doc: "+this.doc+
                " Edad: "+ this.edad+" Correo: "+this.correo+"@klim.com"+" Celular: "+this.celular);
    }    
}


    

