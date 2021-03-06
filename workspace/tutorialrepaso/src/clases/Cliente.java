package clases;

public class Cliente {

		private int idCliente;
		private int edad;
		private String nombre;
		
		//Constructor
		public Cliente(int idCliente, String nombre) {
			this.idCliente = idCliente;
			this.nombre = nombre;
		}
		
		// Compara 1 objeto con otro para saber si es de ese tipo una vez comprobado
		// se realiza la comparaci�n ejecutando un casting.
	public boolean equals(Object obj){
		if(obj instanceof Cliente){
				Cliente c = (Cliente)obj;
				if(c.getIdCliente()==this.idCliente){
					return true;
		}else{
			return false;
		}
			}else{				return false;
		}
		}
		
		
		
	// COdigo del asistente
	
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + idCliente;
				result = prime * result
						+ ((nombre == null) ? 0 : nombre.hashCode());
				return result;
			}
		
		
		
		

		/**
		 * @return the idCliente
		 */
		public int getIdCliente() {
			return idCliente;
		}

//
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Cliente other = (Cliente) obj;
//			if (idCliente != other.idCliente)
//				return false;
//			if (nombre == null) {
//				if (other.nombre != null)
//					return false;
//			} else if (!nombre.equals(other.nombre))
//				return false;
//			return true;
//		}
		
		// Sobrecarga de metodos
		
		public String saludar(){
		return " No se quien eres";	
		}
		public String saludar(String name){
			return "Hola "+nombre+" tienes " + edad + " a�os";
			
		}
		public String saludar(String name, short edad){
			return "Hola "+nombre+" tienes " + edad + " a�os"+"Entra Short";
	
		}
		public String saludar(int edad, String name){
			return "Hola "+nombre+" tienes " + edad + " a�os";
		}
		public String saludar(String nombre, int edad){
			return "Hola "+nombre+" tienes " + edad + " a�os";
		}
		

		/**
		 * @param idCliente the idCliente to set
		 */
		public void setIdCliente(int idCliente) {
			this.idCliente = idCliente;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
	
}
