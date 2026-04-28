/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_semana5;

import java.util.ArrayList;

/**
 *
 * @author UCA40422
 */
public class C_cliente {
    
    ArrayList<Cliente> cl = new ArrayList();
    
    public void agregar (Cliente cliente ){
        
        cl.add(cliente);
    }
    public void Mostrar (){
        for(int i = 0; i<cl.size();i++){
            cl.get(i).verdatos();
        }
    }
}
