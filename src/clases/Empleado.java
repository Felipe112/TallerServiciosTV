package clases;

/**
 * Clase basica que describe a un empleado.
 * @author fray
 *
 */
public class Empleado {
    
    /**
     * Propiedades
     */
    private String nombre;
    private String apellidos;
    private String documento;
    private String direccion;
    private String email;
    private int edad;
    private int anoAntiguedad;
    private String telefono;
    private double salario;
    private String supervisor;
    
    /**
     * Constructor para definir un empleado apartir de su nombre, apellido,
     * email,edad,dirección,teléfono y salario.
     * @param nombre
     * @param apellidos
     * @param direccion
     * @param email
     * @param edad
     * @param telefono
     * @param salario
     */
    public Empleado(String nombre, String apellidos, String direccion, String email, int edad, String telefono, double salario) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;
        this.salario = salario;
    }
    /**
     * Metodos Get y SET, de cada una de las propiedades.
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getAnoAntiguedad() {
        return anoAntiguedad;
    }
    public void setAnoAntiguedad(int anoAntiguedad) {
        this.anoAntiguedad = anoAntiguedad;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
       
    /**
     * Metodo empleado para imprimir todos los datos del empleado
     */
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", documento=" + documento + ", direccion=" + direccion + ", email=" + email + ", edad=" + edad + ", anoAntiguedad="
            + anoAntiguedad + ", telefono=" + telefono + ", salario=" + salario + ", supervisor=" + supervisor + "]";
    }
    /**
     * Metodo cambiar supervisor.
     * @param nuevoSupervisor
     */
    protected void cambiarSupervisor(String nuevoSupervisor) {
        this.setSupervisor(nuevoSupervisor);
        System.out.println("Nuevo supervisor: "+this.getSupervisor());
    }
    
    /**
     * Metodo incrementar el salario.
     * Se recibe el porcentaje el cual se va aumentar, se realiza el calculo con base en el sueldo actual y luego se suma.
     * @param nuevoValor
     */
    protected void incrementarSalario(int porcentaje) {
        double valorPorcentaje = (porcentaje / 100)*this.getSalario();
        double nuevoSalario = this.getSalario()+valorPorcentaje;
        this.setSalario(nuevoSalario);
        System.out.println("Nuevo salario: "+this.getSalario());
    }

}
