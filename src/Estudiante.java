import java.util.*;

public class Estudiante extends Persona {
    private String matricula;
    private int edad;
    private String carrera;
    private String fechaInscripcion;
    private ArrayList<Materia> materias;

    // Constructores

    public Estudiante() {
        super("", "");
        setMatricula("");
        setEdad(0);
        setCarrera("");
        setFechaInscripcion("");

        materias = new ArrayList<>();
    }

    public Estudiante(String matricula, String nombre, String apellido, int edad, String carrera, String fechaInscripcion) {
        super(nombre, apellido);
        setMatricula(matricula);
        setEdad(edad);
        setCarrera(carrera);
        setFechaInscripcion(fechaInscripcion);

        materias = new ArrayList<>();
    }


    // Getters and Setters
    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String toString() {
        return super.toString() + 
               "\nMatrícula: " + getMatricula() + 
               "\nEdad: " + getEdad() + 
               "\nCarrera: " + getCarrera() + 
               "\nFecha de Inscripción: " + getFechaInscripcion();
    }
}
