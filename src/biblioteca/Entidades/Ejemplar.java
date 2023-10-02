
package biblioteca.Entidades;


public class Ejemplar {
    
    public int idEjemplar;
    public int codigo;
    public Libro libro;
    public String estado;

    public Ejemplar() {
    }
    public Ejemplar(int codigo, Libro libro, String estado) {
        this.codigo = codigo;
        this.libro = libro;
        this.estado = estado;
    }
    public Ejemplar(int idEjemplar, int codigo, Libro libro, String estado) {
        this.idEjemplar = idEjemplar;
        this.codigo = codigo;
        this.libro = libro;
        this.estado = estado;
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "idEjemplar=" + idEjemplar + ", codigo=" + codigo + ", libro=" + libro + ", estado=" + estado + '}';
    }
    
    
    
}
