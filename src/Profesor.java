public class Profesor extends Persona {

    private String codigo;
    private String especialidad;

    // Constructores

    public Profesor() {
        super("", "");
        setCodigo("");
        setEspecialidad("");
    }

    public Profesor(String codigo, String nombre, String apellido, String especialidad) {
        super(nombre, apellido);
        setCodigo(codigo);
        setEspecialidad(especialidad);
    }

    // Getters and Setters
    public String getCodigo() {
        return codigo;
    }   

    public String getEspecialidad() {
        return especialidad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nCódigo: " + getCodigo() + 
               "\nEspecialidad: " + getEspecialidad();
    }
}
