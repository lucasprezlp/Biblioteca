/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.Data.LectorData;
import biblioteca.Entidades.Lector;

/**
 *
 * @author lucas
 */
public class Biblioteca {

   
    public static void main(String[] args) {
      
        //pruebas de la clase LectorData.
        
        Lector lector = new Lector();
        LectorData ld = new LectorData();
        
//        ld.desactivarLector(1);
        ld.activarLector(1);
        
        
    }
    
}
