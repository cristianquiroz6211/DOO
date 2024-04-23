package co.edu.uco.tiendachepito.dto;

public  final class DepartamentoDTO {

		private int id;
		private String  nombre;
		private paisDTO Pais;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public paisDTO getDepartamento() {
			return departamento;
		}
		public void setDepartamento(paisDTO departamento) {
			this.departamento = departamento;
		}
		


}
