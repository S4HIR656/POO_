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
        private String doc;
        private int edad;
        private String correo;
        private String celular;
        private String cate;
        
        public Cliente(String nombre, String Apaterno, String Amaterno, String t_doc, String doc, 
                   int edad, String correo, String celular, String cate) 
        {
        this.nombre = nombre;
        this.Apaterno = Apaterno;
        this.Amaterno = Amaterno;
        this.t_doc = t_doc;
        setDoc(doc);
        setEdad(edad);
        this.correo = correo;
        setCelular(celular);
        this.cate = cate;
    }

    // No borres el constructor vacío por si lo usas en otro lado:
    public Cliente() {
    }
    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }
    
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

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {

    if (this.t_doc.equalsIgnoreCase("DNI")) {

        if (doc == null || doc.length() != 8) {
            throw new IllegalArgumentException("El DNI debe tener 8 dígitos");
        }
        for (int i = 0; i < doc.length(); i++) {
            if (!Character.isDigit(doc.charAt(i))){
                throw new IllegalArgumentException("El DNI solo debe contener números");
            }
            }

        } else if (this.t_doc.equalsIgnoreCase("CE")) {

            if (doc == null || doc.length() != 9) {
            throw new IllegalArgumentException("El CE debe tener 9 dígitos");
            }
            
            for (int i = 0; i < doc.length(); i++) {
            if (!Character.isDigit(doc.charAt(i))) {
                throw new IllegalArgumentException("El CE debe contener solo números");
                }
            }

        } else {
            throw new IllegalArgumentException("Tipo de documento no identificado.");
        }

    this.doc = doc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <= 0) {
        throw new IllegalArgumentException("La edad debe ser mayor a 0");
        }
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        if (celular == null || celular.length() != 9) {
        throw new IllegalArgumentException("El celular debe tener 9 dígitos");
    }

    for (int i = 0; i < celular.length(); i++) {
        if (!Character.isDigit(celular.charAt(i))) {
            throw new IllegalArgumentException("El celular solo debe contener números");
        }
    }
        this.celular = celular;
    }
 
    public void verdatos(){
        
        System.out.println("Apellidos: "+this.Apaterno+" "+this.Amaterno+
                " Nombre: "+this.nombre+" Tipo de doc: "+this.t_doc+" Número de doc: "+this.doc+
                " Edad: "+ this.edad+" Correo: "+this.correo +" Celular: "+this.celular +
                " Categoría: " + this.cate);
    }    
     
}


    

