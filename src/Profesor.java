public class Profesor {

    private String codigo;
    private String nombre;
    private String apellido;
    private String especialidad;

    // Constructores

    public Profesor() {
        setCodigo("");
        setNombre("");
        setApellido("");
        setEspecialidad("");
    }

    public Profesor(String codigo, String nombre, String apellido, String especialidad) {
        setCodigo(codigo);
        setNombre(nombre);
        setApellido(apellido);
        setEspecialidad(especialidad);
    }

    // Getters and Setters
    public String getCodigo() {
        return codigo;
    }   

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
