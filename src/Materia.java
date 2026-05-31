public class Materia {

    private String codigo;
    private String nombre;
    private int creditos;
    private double calificacion;

    // Constructores
    public Materia() {
        setCodigo("");
        setNombre("");
        setCreditos(0);
        setCalificacion(0);
    }

    public Materia(String codigo, String nombre, int creditos) {
        setCodigo(codigo);
        setNombre(nombre);
        setCreditos(creditos);
        setCalificacion(0);
    }

    // Constructor copia 
    public Materia(Materia otraMateria) {
        setCodigo(otraMateria.getCodigo());
        setNombre(otraMateria.getNombre());
        setCreditos(otraMateria.getCreditos());
        setCalificacion(0); 
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String toString() {
        return "Código: " + getCodigo() +
                "\nNombre: " + getNombre() +
                "\nCréditos: " + getCreditos();
    }
}
