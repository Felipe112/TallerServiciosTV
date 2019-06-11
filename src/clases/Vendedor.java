package clases;

/**
 * Clase vendedor
 * @author fray
 *
 */
public class Vendedor extends Empleado {
    
    /**
     * Propiedades
     */
    private Vehiculo vehiculo;

    /**
     * Constructor el cual hereda el constructor del padre[Empleado], y donde se llenan los datos personales y 
     * los datos basicos de un vendedor.
     * @param nombre
     * @param apellidos
     * @param direccion
     * @param email
     * @param edad
     * @param telefono
     * @param salario
     */
    public Vendedor(String nombre, String apellidos, String direccion, String email, int edad, String telefono, double salario) {
        super(nombre, apellidos, direccion, email, edad, telefono, salario);
    }
    
    
}
