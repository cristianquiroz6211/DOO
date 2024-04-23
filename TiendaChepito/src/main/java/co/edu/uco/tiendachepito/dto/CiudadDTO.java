package co.edu.uco.tiendachepito.dto;

public  final class CiudadDTO {
	private int id;
	private String  nombre;
	private DepartamentoDTO departamento;
	
	public int getId() {
		return id;
	}
	public  final void setId(int id) {
		this.id = id;
		return this;
	}
	public final  String getNombre() {
		return nombre;
	}
	public  final void setNombre(final String nombre) {
		this.nombre = nombre;
	}
	public  final DepartamentoDTO getDepartamento() {
		return departamento;
	}
	public final void setDepartamento(final DepartamentoDTO departamento) {
		this.departamento = departamento;
	}
	

}
