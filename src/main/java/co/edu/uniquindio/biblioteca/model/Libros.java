package co.edu.uniquindio.biblioteca.model;

public class Libros {
    private String nombre;
    private String codigo;
    private String seccion;
    private String autor;
    private String editorial;

    public Libros(String nombre, String codigo, String seccion, String autor, String editorial) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.seccion = seccion;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}


