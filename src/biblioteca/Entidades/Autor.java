
package biblioteca.Entidades;


public class Autor {
    public String Nombre;
    public String Apellido;

    public Autor(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public Autor() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "Autor{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + '}';
    }
   
    
    
}
