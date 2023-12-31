
package biblioteca.Data;

import biblioteca.Entidades.Ejemplar;
import biblioteca.Entidades.EstadosEjemplar;
import biblioteca.Entidades.Libro;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LibroData {

    private Connection con = null;

    public LibroData() {
        con = conexion.getConexion();
    }
    
    PreparedStatement ps; 

    public void guardarLibro(Libro libro) {
        String sql = "INSERT INTO libro(isbn, titulo, autor, anio, tipo, Editor, estado, numEjemplares)"
                + " VALUES (?,?,?,?,?,?,?,?);";
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, libro.getIsbn());
            ps.setString(2, libro.getTitulo());
            ps.setString(3, libro.getAutor());
            ps.setInt(4, libro.getAnio());
            ps.setString(5, libro.getTipo());
            ps.setString(6, libro.getEditor());
            ps.setBoolean(7, libro.isEstado());
            ps.setInt(8, libro.getNumEjemplares());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
//                libro.setIdLibro(rs.getInt(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un id correcto/diferente");
        }
    }
    
    public Libro buscarLibroXTitulo(String titulo) {
        String sql = "SELECT idLibro, isbn, titulo, autor, anio, tipo, Editor, numEjemplares"
                + " FROM libro WHERE titulo = ? and estado = 1";
        Libro libro=null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, titulo);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                libro= new Libro();
                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setAnio(rs.getInt("anio"));
                libro.setTipo(rs.getString("tipo"));
                libro.setEditor(rs.getString("Editor"));
                libro.setEstado(rs.getBoolean(1));libro.setNumEjemplares(rs.getInt("numEjemplares"));

            }   else{
                JOptionPane.showMessageDialog(null, "Libro esta inactivo o no existe");
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
            System.out.println(ex);
        }
        return libro;
    }
    
    public int buscarIdxNombre(String titulo) {
        String sql = "SELECT idLibro FROM libro WHERE titulo = ?";
        int idLibro = -1;
        try {
             ps = con.prepareStatement(sql);
             ps.setString(1, titulo);
             ResultSet rs = ps.executeQuery();
            if (rs.next()) 
                idLibro = rs.getInt("idLibro");             

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al obtener el idLibro portitulo en la base de datos: " + ex.getMessage());
        } 
        return idLibro;         
        }

   public void modificarLibro(Libro libro) {
    String sql = "UPDATE libro SET isbn=?, titulo=?, autor=?, anio=?, tipo=?, editor=?, estado=?, numEjemplares=? WHERE idLibro = ?";
    try {
        ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, libro.getIsbn());
        ps.setString(2,libro.getTitulo()); ///// NO ENTIENDO POR QUE NO MEDIFICA EL TITULO
        ps.setString(3, libro.getAutor());
        ps.setInt(4, libro.getAnio());
        ps.setString(5, libro.getTipo());
        ps.setString(6, libro.getEditor());
        ps.setBoolean(7, libro.isEstado());
        ps.setInt(8, libro.getNumEjemplares());
        ps.setInt(9, libro.getIdLibro());
        
        int exito = ps.executeUpdate();
    
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Libro modificado con éxito: " + libro.getTitulo());
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el libro: " + libro.getTitulo() );
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al intentar modificar el libro: " + ex.getMessage());
    }
}
    
    public ArrayList<Ejemplar> listarLibrosXautor(String autor) {

        String sqla = "SELECT titulo, Editor, ejemplar.codigo, ejemplar.estado  FROM `libro`\n"
                + "JOIN ejemplar on (libro.idLibro = ejemplar.idLibro)\n"
                + "WHERE libro.estado=1 and autor like ?;";
        ArrayList<Ejemplar> ejemplares = new ArrayList<>();
        try {
            ps = con.prepareStatement(sqla);
            ps.setString(1, autor);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Libro libro = new Libro();
                libro.setTitulo(rs.getString("titulo"));
                libro.setEditor(rs.getString("Editor"));
                Ejemplar eje = new Ejemplar(libro, rs.getInt("codigo"), EstadosEjemplar.valueOf(rs.getString("estado")));

                ejemplares.add(eje);
            }
            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el libro" + ex);
        }

        return ejemplares;
    }
    
    public void eliminarLibro(int idLibro) {

        String sql = "UPDATE libro SET estado = 0 WHERE idLibro = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idLibro);
            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Se desactivo el libro");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " + ex);
        }
    } 
}


