package co.edu.uniquindio.biblioteca.model;

public class Empleado {
    private String nombre;
    private String id;
    private String telefono;
    private String email;
    private String edad;

    public Empleado(String nombre, String id, String telefono, String email, String edad) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.email = email;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
