package eafit.integracion;

public class C_Validar1 {
	
	String cadena;
	Tipo tipo;
	
	boolean ValidarRqUid() {
		
		boolean estado=true;
		
		if(this.cadena==null) {
			estado=false;
		}
		
		return estado;
	}
	
	
	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
