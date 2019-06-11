package clases;

/**
 * Clase Secretario
 * @author fray
 *
 */
public class Secretario extends Empleado {

    /**
     * Propiedades
     */
    private String despacho;
    private int fax;
    
    /**
     * Constructur que hereda del padre donde se definen los datos personales del empleado, y se llenan los datos basicos.
     * @param nombre
     * @param apellidos
     * @param direccion
     * @param email
     * @param edad
     * @param telefono
     * @param salario
     */
    public Secretario(String nombre, String apellidos, String direccion, String email, int edad, String telefono, double salario,String despacho,int fax) {
        super(nombre, apellidos, direccion, email, edad, telefono, salario);
        
        this.despacho=despacho;
        this.fax=fax;
    }
    
       
    /**
     * Metodos get y set de las propiedades
     * @return
     */
    public String getDespacho() {
        return despacho;
    }
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }
    public int getFax() {
        return fax;
    }
    public void setFax(int fax) {
        this.fax = fax;
    }



    /**
     * Metodo empleado para aumentar el sueldo del secretario, en un 5 por ciento.
     */
    public void incrementarSalario() {
        super.incrementarSalario(5);
    }
    
    
    /**
     * Metodo imprimir datos personales y puesto de la empresa
     */    
    public void imprimir() {
        System.out.println("SECRETARIO:   "+this.toString());
    }

    
    
}
