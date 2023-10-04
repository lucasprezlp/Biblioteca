

package biblioteca.Data;

import biblioteca.Entidades.Ejemplar;
import java.sql.Connection;



public class PrestamoData {
     private Connection con=null;
    
    public PrestamoData(){
        con=conexion.getConexion();
    }
    
    public void solicitarLibro(Ejemplar ejemplar){
        
    }
}
