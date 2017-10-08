
public class Ayuntamiento {
	private int numHabitantes;
	private String nombre;
	
	public Ayuntamiento(int numHabitantes, String nombre) {
		super();
		this.numHabitantes = numHabitantes;
		this.nombre = nombre;
	}

	public int getNumHabitantes() {
		return numHabitantes;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "[Habitantes:" + numHabitantes + "] [Nombre: " + nombre+"]";
	}

	
	
}
