/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.Data.LectorData;
import biblioteca.Data.LibroData;
import biblioteca.Entidades.Ejemplar;
import biblioteca.Entidades.EstadosEjemplar;
import biblioteca.Entidades.Lector;
import biblioteca.Entidades.Libro;

/**
 *
 * @author lucas
 */
public class Biblioteca {

   
    public static void main(String[] args) {
      
        //pruebas de la clase LectorData.
        
        Lector lector = new Lector();
        LectorData ld = new LectorData();
        Libro lib = new Libro(1, "Caperucita roja", "Pedrito Gómez", 1985, "Cuento infantil", "Ed Planeta", true, 5);
        Libro lib1 = new Libro(2, 1, "1974", "George Orwell", 1974, "Novela", "Ediciones ULP", true, 2);
        LibroData lbd = new LibroData();
        Ejemplar ej = new Ejemplar(0, lib, EstadosEjemplar.DISPONIBLE);
        
        
//        ld.desactivarLector(1);
       // ld.activarLector(1);
        //lbd.guardarLibro(lib);
        lbd.modificarLibro(lib1);
    }
    
}
