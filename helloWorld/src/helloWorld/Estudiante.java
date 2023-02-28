package helloWorld;

public class Estudiante {
	
	public Estudiante() {
		this.id = 1;
		this.edad = 22;
		this.telefono = "123456789";
		this.numeroDeNotas = 1;
		this.sumaDeNotas = 2;
		this.notaMedia = 3;
	}
	public Estudiante(int id, int edad, String telefono, int numeroDeNotas, int sumaDeNotas, int notaMedia) {
//		super();
		this.id = id;
		this.edad = edad;
		this.telefono = telefono;
		this.numeroDeNotas = numeroDeNotas;
		this.sumaDeNotas = sumaDeNotas;
		this.notaMedia = notaMedia;
	}
	
	int id;
	int edad;
	String telefono;
	int numeroDeNotas;
	int sumaDeNotas;
	int notaMedia;
	
	void mostrarInfo() {}
	void agregarNuevaNota() {}
	public static Estudiante crearEstudiante() {
		Estudiante estudiante = new Estudiante();
		return estudiante;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public int getNumeroDeNotas() {
		return numeroDeNotas;
	}
	public void setNumeroDeNotas(int numeroDeNotas) {
		this.numeroDeNotas = numeroDeNotas;
	}
	
	public int getSumaDeNotas() {
		return sumaDeNotas;
	}
	public void setSumaDeNotas(int sumaDeNotas) {
		this.sumaDeNotas = sumaDeNotas;
	}
	
	public int getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}
	

	
	public static void main(String[] args) {
		Estudiante Jaume = new Estudiante();
	}
}
