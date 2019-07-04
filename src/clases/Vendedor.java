package clases;

import java.util.List;
import java.util.Optional;

/**
 * Clase vendedor
 * 
 * @author fray
 *
 */
public class Vendedor extends Empleado {

	/**
	 * Propiedades
	 */
	private Vehiculo vehiculo;
	private String telefonoMovil;
	private String areaVenta;
	private List<Cliente> listaClientes;
	private int porcentaje;

	/**
	 * Constructor el cual hereda el constructor del padre[Empleado], y donde se
	 * llenan los datos personales y los datos basicos de un vendedor.
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param direccion
	 * @param email
	 * @param edad
	 * @param telefono
	 * @param salario
	 */
	public Vendedor(String nombre, String apellidos, String direccion, String email, int edad, String telefono,
			double salario) {
		super(nombre, apellidos, direccion, email, edad, telefono, salario);
	}

	/**
	 * Metodos get y set para las propiedades
	 * 
	 * @return
	 */

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	/**
	 * Este metodo se puede implementar como el metodo cambiar de vehiculo, ya que
	 * recibe un objecto vehiculo y lo setea dentro de la propiedad vehiculo del
	 * vendedor.
	 * 
	 * @param vehiculo
	 */
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public String getAreaVenta() {
		return areaVenta;
	}

	public void setAreaVenta(String areaVenta) {
		this.areaVenta = areaVenta;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	/**
	 * Metodo imprimir datos personales y puesto de la empresa
	 */
	public void imprimir() {
		System.out.println("VENDEDOR:   " + this.toString());
	}

	/**
	 * Metodo empleado para aumentar el sueldo del vendedor, en un 10 por ciento.
	 */
	public void incrementarSalario() {
		super.incrementarSalario(10);
	}

	/**
	 * Metodo empleado para creación de clientes dentro de la lista de clientes
	 * 
	 * @param documento
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param telefono
	 * @param tipoPlan
	 */
	public void crearNuevoCliente(int documento, String nombre, String apellido, String direccion, String telefono,
			TipoPlan tipoPlan) {
		Cliente cliente = new Cliente(documento, nombre, apellido, direccion, telefono, tipoPlan);
		this.listaClientes.add(cliente);
	}

	/**
	 * Metodo empleado para remover cliente.
	 * 
	 * @param documento
	 */
	public void eliminarCliente(int documento) {
		Optional<Cliente> cliente = this.listaClientes.stream().filter(x -> documento == x.getDocumento()).findFirst();
		if (cliente.isPresent()) {
			this.listaClientes.remove(cliente);
		}
	}

}
