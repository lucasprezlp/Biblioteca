package biblioteca.Data;

import biblioteca.Entidades.Lector;
import biblioteca.Entidades.Prestamo;
import com.sun.imageio.plugins.jpeg.JPEG;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LectorData {

    private Connection con = null;

    public LectorData() {
        con = conexion.getConexion();
    }

    PreparedStatement ps;

    public void activarLector(int idLector) {
    
        String sql = "UPDATE lector SET estado = 1 WHERE idLector=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLector);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se activo el lector");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la BD lector");
        }

    }

    public void desactivarLector(int idLector) {

        String sql = "UPDATE lector SET estado = 0 WHERE idLector=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idLector);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se desactivo el lector");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la BD lector");
        }

    }

    public void guardarLector(Lector lector) {

        String sql = "INSERT INTO lector(nroSocio, nombreCompleto, dni, domicilio, mail, estado, telefono)"
                + " VALUES (?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, lector.getNroSocio());
            ps.setString(2, lector.getNombreCompleto());
            ps.setInt(3, lector.getDni());
            ps.setString(4, lector.getDomicilio());
            ps.setString(5, lector.getMail());
            ps.setBoolean(6, lector.isEstado());
            ps.setInt(7, lector.getTelefono());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                lector.setIdLector(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Lector agregado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un id correcto/diferente"+ "\n" + ex);
            System.out.println(ex);
        } catch (NumberFormatException exx){
            JOptionPane.showMessageDialog(null, "Ingrese datos correctos");
        }
    }

    public void modificarLector(Lector lector) {

        String sql = "UPDATE lector SET nroSocio=?,nombreCompleto=?,domicilio=?,mail=?,dni=?,telefono=?,estado=?"
                + " WHERE idLector=?";
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, lector.getNroSocio());
            ps.setString(2, lector.getNombreCompleto());
            ps.setString(3, lector.getDomicilio());
            ps.setString(4, lector.getMail());
            ps.setInt(5, lector.getDni());
            ps.setInt(6, lector.getTelefono());
            ps.setBoolean(7, lector.isEstado());
            ps.setInt(8, lector.getIdLector());
            ps.executeUpdate();
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Lector modificado con éxito");
            }else{
                JOptionPane.showMessageDialog(null, "Lector no encontrado");
            }
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un id correcto/diferente"+ "\n" + ex);
            System.out.println(ex);
        } catch (NumberFormatException exx){
            JOptionPane.showMessageDialog(null, "Ingrese datos correctos");
        }
    }

    public Lector buscarLector(String nombreLector) {

        String sql = "SELECT * FROM lector WHERE nombreCompleto = ?";
        Lector lectorEncontrado = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreLector);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                lectorEncontrado = new Lector();
                lectorEncontrado.setIdLector(rs.getInt("idLector"));
                lectorEncontrado.setNroSocio(rs.getInt("nroSocio"));
                lectorEncontrado.setNombreCompleto(rs.getString("nombreCompleto"));
                lectorEncontrado.setDomicilio(rs.getString("domicilio"));
                lectorEncontrado.setMail(rs.getString("mail"));
                lectorEncontrado.setDni(rs.getInt("dni"));
                lectorEncontrado.setTelefono(rs.getInt("telefono"));
                lectorEncontrado.setEstado(rs.getBoolean("estado"));
                JOptionPane.showMessageDialog(null, "lector encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "lector no encontrado, ingrese el nombre completo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el lector en la base de datos: " + ex.getMessage());
        }

        return lectorEncontrado;
    }

    public int obtenerIdLectorPorNombre(String nombreCompleto) {

        String sql = "SELECT idLector FROM lector WHERE nombreCompleto = ?";
        int idLector = -1; // Valor por defecto en caso de que no se encuentre un lector

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreCompleto);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                idLector = rs.getInt("idLector");
            } else {
                JOptionPane.showMessageDialog(null, "lector no encontrado");
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el idLector por nombre en la base de datos: " + ex.getMessage());
        }

        return idLector;
    }

    public Boolean EstadoLector(int idlector) {
    
        String sql = "SELECT estado FROM lector WHERE idLector = ?";
        Boolean estado = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,idlector );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                estado = rs.getBoolean("estado");
                LectorData l = new LectorData();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el idLector por nombre en la base de datos: " + ex.getMessage());
        }
        return estado;
    }

    public void Moroso(String nombreCompleto,  DefaultTableModel modelo) {
        try {
            String sql = "SELECT l.titulo, p.fechaFin, e.codigo FROM prestamo p"
                    + " INNER JOIN ejemplar e ON p.idEjemplar = e.idEjemplar"
                    + " INNER JOIN libro l ON e.idLibro = l.idLibro"
                    + " inner join lector on p.idLector= lector.idLector"
                    + " where lector.nombreCompleto = ? AND p.FechaFin <= CURRENT_DATE";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombreCompleto);
            LocalDate fechaActual = LocalDate.now();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String tituloLibro = rs.getString("titulo");
                LocalDate fechaDevolucion = rs.getDate("fechaFin").toLocalDate();
                int codigoEjemplar = rs.getInt("codigo");

                if (fechaDevolucion.isBefore(fechaActual)) {
                    System.out.println("Título del libro: " + tituloLibro
                            + " Fecha de devolución: " + fechaDevolucion
                            + " Código del ejemplar: " + codigoEjemplar);
                modelo.addRow(new Object[]{tituloLibro, fechaDevolucion, codigoEjemplar});

                }
                
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "ni idea" + ex);

        }
    }
}
 