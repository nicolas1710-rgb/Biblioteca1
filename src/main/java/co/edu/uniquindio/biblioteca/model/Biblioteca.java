package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList <Cliente> ListaClientes= new ArrayList<>();
    private ArrayList <Empleado> ListaEmpleados= new ArrayList<>();
    private ArrayList <Libros> ListaLibros= new ArrayList<>();
    private ArrayList <prestamo> ListaPrestamos= new ArrayList<>();

    public Biblioteca(String nombre){

        this.nombre=nombre;
    }
    public String getNombre(){

        return this.nombre;
    }
    public void setNombre(String nombre){

        this.nombre=nombre;
    }

    public void agregarCliente(String nombre, String id,String telefono, String email, String edad){
        Cliente cliente=new Cliente(nombre,id,telefono,email,edad);
        ListaClientes.add(cliente);
        System.out.println("cliente agregado correctamente");
    }
    public void agregarEmpleado(String nombre, String id,String telefono, String email, String edad){
        Empleado empleado=new Empleado(nombre,id,telefono,email,edad);
        ListaEmpleados.add(empleado);
        System.out.println("empleado agregado correctamente");
    }
    public void agregarLibro(String nombre, String codigo, String seccion, String autor, String editorial){
        Libros libro = new Libros(nombre, codigo, seccion, autor, editorial);
        ListaLibros.add(libro);
        System.out.println("libro agregado correctamente");
    }
    public void agregarPrestamo (String libroPrestamo, String fechaPrestamo, String NumeroPrestamo, String fechaDevolucion, String nombrePersona){
        prestamo prestamos = new prestamo(libroPrestamo, fechaPrestamo, NumeroPrestamo, fechaDevolucion, nombrePersona);
        ListaPrestamos.add(prestamos);
        System.out.println("prestamo agregado correctamente");
    }
    public Cliente buscarCliente (String nombre){
        for (Cliente cliente : ListaClientes){
            if (cliente.getNombre().equals(nombre)){
                return cliente;
            }
        }
        return null;
    }
    public Libros buscarLibros (String nombre){
        for (Libros libro : ListaLibros){
            if (libro.getNombre().trim().equalsIgnoreCase(nombre)){
                return libro;
            }
        }
        return null;
    }

}
