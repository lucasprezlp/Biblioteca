/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.Data.LectorData;
import biblioteca.Data.LibroData;
import biblioteca.Data.EjemplarData;
import biblioteca.Entidades.Ejemplar;
import biblioteca.Entidades.EstadosEjemplar;
import biblioteca.Entidades.Lector;
import biblioteca.Entidades.Libro;

public class Biblioteca {

    public static void main(String[] args) {
      
        ///PRUEBAS DE LA CLASE LECTORDATA
        
//         Lector lector = new Lector(14, "Juan Perez", "Jose Marmol 78", "juancito@yahoo.com.ar", 4587584, 111111, true);//metodo guardar y eliminar
//         Lector lec1 =new Lector(58, "Maria Robledo", "Rivadavia 789", "mariaro@gmail.com", 25665895, 22222, true);/// metodo modificar
//         Lector lector2 = new Lector(16, "Jose armendo", "pasaje 45", "juancito@yahoo.com.ar", 45647584, 111111, true);
//         Lector lector3 = new Lector(17, "Veronica acosta", "Ribadavia", "juancito@yahoo.com.ar", 7737584, 111111, true);
//         LectorData ld = new LectorData();
        // ld.desactivarLector(1);
        // ld.activarLector(1);    
//        ld.guardarLector(lector);
//        ld.guardarLector(lec1);
//        ld.guardarLector(lector2);
//        ld.guardarLector(lector3);
        //ld.modificarLector(lec1); /////((((para cambiar y hacer upgrade, usamos el constructor con id)))///
        
        ///PRUEBAS DE LA CLASE LIBRODATA
        
        Libro lib = new Libro(1, "Caperucita roja", "Pedrito Gómez", 1985, "Cuento infantil", "Ed Planeta", true, 5);
//        Libro lib1 = new Libro(2, 1, "1974", "George Orwell", 1974, "Novela", "Ediciones ULP", true, 2);
        LibroData lbd = new LibroData();  
       
        //lbd.guardarLibro(lib);
        //lbd.modificarLibro(lib);   
        //lbd.eliminarLibro(1);
        
        for(Libro lib : lbd.listarLibrosXautor("Gabriel García Márquez")){
            System.out.println("titulo "+ lib.getTitulo());
            System.out.println("numEjemplares "+ lib.getNumEjemplares());
        }
        
        
       
       ///PRUEBAS DE LA CLASE EJEMPLARDATA
       
        Ejemplar ej = new Ejemplar(8, lib, EstadosEjemplar.DISPONIBLE);
        EjemplarData ejeD = new EjemplarData();
        ejeD.guardarEjemplar(ej);
        
        ///PRUEBAS DE LA CLASE PRESTAMODATA
        

    }
    
}
