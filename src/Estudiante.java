public class Estudiante {
    private String matricula;
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private String fechaInscripcion;

    // Constructores

    public Estudiante() {
        setMatricula("");
        setNombre("");
        setApellido("");
        setEdad(0);
        setCarrera("");
        setFechaInscripcion("");
    }

    public Estudiante(String matricula, String nombre, String apellido, int edad, String carrera, String fechaInscripcion) {
        setMatricula(matricula);
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setCarrera(carrera);
        setFechaInscripcion(fechaInscripcion);
    }

    // Getters and Setters
    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        return "Matrícula: " + getMatricula() +
                "\nNombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nEdad: " + getEdad() +
                "\nCarrera: " + getCarrera() +
                "\nFecha de Inscripción: " + getFechaInscripcion();
    }
}
