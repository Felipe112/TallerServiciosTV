package clases;

/**
 * Clase empleada para representar los clientes.
 * @author fray
 *
 */
public class Cliente {
    
    /**
     * Propiedades
     */
    private int documento;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private TipoPlan tipoPlan;
    
    /**
     * Constructor
     * @param documento
     * @param nombre
     * @param apellido
     * @param direccion
     * @param telefono
     * @param tipoPlan
     */
    public Cliente(int documento, String nombre, String apellido, String direccion, String telefono, TipoPlan tipoPlan) {
        super();
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoPlan = tipoPlan;
    }

    /***
     * Metodos get y set para las propiedades
     * @return
     */
    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TipoPlan getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(TipoPlan tipoPlan) {
        this.tipoPlan = tipoPlan;
    }
       
}
