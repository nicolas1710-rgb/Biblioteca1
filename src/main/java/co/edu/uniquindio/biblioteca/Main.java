package co.edu.uniquindio.biblioteca;
import co.edu.uniquindio.biblioteca.model.Biblioteca;
import co.edu.uniquindio.biblioteca.model.Cliente;
import co.edu.uniquindio.biblioteca.model.Empleado;
import co.edu.uniquindio.biblioteca.model.Libros;
import co.edu.uniquindio.biblioteca.model.prestamo;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca bibliotecaPrincipal=new Biblioteca("Biblioteca principal");
        int opcion;

        do{
            System.out.println("Ingrese la opcion que desea ejectutar:");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Crear Empleado");
            System.out.println("3. Crear Libro");
            System.out.println("4. Crear Prestamo");
            System.out.println("5. Validar Edad de cliente");
            System.out.println("6. Validar Nombre de libro");
            System.out.println("7. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    crearCliente(sc,bibliotecaPrincipal);
                    break;
                case 2:
                    crearEmpleado(sc,bibliotecaPrincipal);
                    break;
                case 3:
                    crearLibro(sc,bibliotecaPrincipal);
                    break;
                case 4:
                    crearPrestamo(sc,bibliotecaPrincipal);
                    break;
                case 5:
                    validarEdadCliente(sc,bibliotecaPrincipal);
                    break;
                case 6:
                    validarNombreLibro(sc,bibliotecaPrincipal);
                    break;
                case 7:
                    System.out.println("saliendo de biblioteca");
                    break;
                default:
                    System.out.println("Opcion invalida seleccione una opcion del 1 al 7");
                    break;
            }
        } while (opcion != 7);
    }
    public static void crearCliente(Scanner sc,Biblioteca bibliotecaPrincipal){
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el id del cliente:");
        String id = sc.nextLine();
        System.out.println("Ingrese el telefono del cliente:");
        String telefono = sc.nextLine();
        System.out.println("Ingrese el email del cliente:");
        String email= sc.nextLine();
        System.out.println("Ingrese la edad del cliente:");
        String edad= sc.nextLine();
        bibliotecaPrincipal.agregarCliente(nombre,id,telefono,email,edad);
    }
    public static void crearEmpleado(Scanner sc,Biblioteca bibliotecaPrincipal){
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el id del empleado:");
        String id = sc.nextLine();
        System.out.println("Ingrese el telefono del empleado:");
        String telefono = sc.nextLine();
        System.out.println("Ingrese el email del empleado:");
        String email= sc.nextLine();
        System.out.println("Ingrese la edad del empleado:");
        String edad= sc.nextLine();
        bibliotecaPrincipal.agregarEmpleado(nombre,id,telefono,email,edad);
}
    public static void crearLibro(Scanner sc,Biblioteca bibliotecaPrincipal) {
        System.out.println("Ingrese el nombre del libro:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el codigo del libro");
        String codigo = sc.nextLine();
        System.out.println("Ingrese la seccion del libro:");
        String seccion = sc.nextLine();
        System.out.println("Ingrese el autor del libro");
        String autor = sc.nextLine();
        System.out.println("Ingrese la editorial del libro");
        String editorial = sc.nextLine();
        bibliotecaPrincipal.agregarLibro(nombre,codigo,seccion,autor,editorial);

    }
    public static void crearPrestamo(Scanner sc,Biblioteca bibliotecaPrincipal) {
        System.out.println("Ingrese el nombre del libro prestado:");
        String libroPrestamo = sc.nextLine();
        System.out.println("Ingrese fecha del prestamo");
        String fechaPrestamo = sc.nextLine();
        System.out.println("Ingrese el numero del prestamo");
        String NumeroPrestamo = sc.nextLine();
        System.out.println("Ingrese la fecha de devolucion");
        String fechaDevolucion = sc.nextLine();
        System.out.println("Ingrese el nombre de la persona que desea el prestamo:");
        String nombrePersona = sc.nextLine();
        bibliotecaPrincipal.agregarPrestamo (libroPrestamo,fechaPrestamo,NumeroPrestamo,fechaDevolucion,nombrePersona);
    }
    public static void validarEdadCliente (Scanner sc, Biblioteca bibliotecaPrincipal) {
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine().trim();
        Cliente cliente = bibliotecaPrincipal.buscarCliente(nombre);
        if (cliente != null) {
            System.out.println("ingrese la edad a validar");
            String edad =sc.nextLine().trim();
            if(cliente.getEdad().equals(edad)){
                System.out.println("Edad del cliente valida "+cliente.getEdad());
            }
        } else {
            System.out.println("No existe el cliente o la edad no coincide " + nombre);

        }
    }

        public static void validarNombreLibro (Scanner sc, Biblioteca bibliotecaPrincipal){
            System.out.println ("Ingrese el nombre del libro: ");
            String nombre = sc.nextLine().trim();
            Libros libro = bibliotecaPrincipal.buscarLibros(nombre);
            if (libro != null){
                System.out.println("Libro encontrado: " + libro.getNombre() + "\nSeccion: "+ libro.getSeccion());
            }else{
                System.out.print("No existe el libro con el nombre: " + nombre);
}
        }
    }