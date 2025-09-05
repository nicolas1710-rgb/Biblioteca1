package co.edu.uniquindio.biblioteca.model;

public class prestamo {
    private String libroPrestamo;
    private String fechaPrestamo;
    private String NumeroPrestamo;
    private String fechaDevolucion;
    private String nombrePersona;
    public prestamo(String libroPrestamo, String fechaPrestamo, String numeroPrestamo, String fechaDevolucion, String nombrePersona) {
        this.libroPrestamo = libroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.NumeroPrestamo = numeroPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.nombrePersona = nombrePersona;
    }

    public String getLibroPrestamo() {
        return libroPrestamo;
    }

    public void setLibroPrestamo(String libroPrestamo) {
        this.libroPrestamo = libroPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getNumeroPrestamo() {
        return NumeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.NumeroPrestamo = numeroPrestamo;
    }

    public String getFechaDevolucion() {

        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {

        this.fechaDevolucion = fechaDevolucion;
    }
    public String getNombrePersona() {
        return nombrePersona;

    }
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
}
