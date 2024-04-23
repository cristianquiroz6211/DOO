package co.edu.uco.tiendachepito.dto;

import co.edu.uco.tiendachepito.crosscutting.helpers.textHelper;

public final class PaisDTO {
	private int id;
	private String  nombre;
	
	public PaisDTO() {
		setNombre(textHelper.EMPTY);
	}
	
	
	public PaisDTO( final int id,  final String nombre) {
		super();
		setId(id);
		setNombre(nombre);
	}
	
	public  final int getId() {
		return id;
	}
	public  final void setId(int id) {
		this.id = id;
	}
	public final  String getNombre() {
		return nombre;
	}
	public final  void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static final PaisDTO build() {
		return PaisDTO();
	}
	

}
