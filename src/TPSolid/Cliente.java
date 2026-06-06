package TPSolid;

public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private double sueldoMensual;

    public Cliente(String nombre,
                   String apellido,
                   String direccion,
                   int edad,
                   double sueldoMensual) {

        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDireccion(direccion);
        this.setEdad(edad);
        this.setSueldoMensual(sueldoMensual);
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	public double getSueldoAnual() {
		return this.getSueldoMensual() *12;
	}
}
