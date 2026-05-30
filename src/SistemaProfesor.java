import java.util.*;

public class SistemaProfesor {
    private ArrayList<Profesor> profesores;

    public SistemaProfesor() {
        profesores = new ArrayList<>();
    }

    public void registrarProfesor(Scanner sc) {
        System.out.print("\n|> Ingrese el código del profesor: ");
        String codigo = sc.nextLine();

        for (Profesor p : profesores) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Ya existe un profesor con ese código.");
                return;
            }
        }

        while (codigo.isEmpty()) {
            System.out.print("El código no puede estar vacío. \n|> Ingrese un código válido: ");
            codigo = sc.nextLine();
        }

        System.out.print("|> Ingrese el nombre del profesor: ");
        String nombre = sc.nextLine();

        while (nombre.isEmpty()) {
            System.out.print("El nombre no puede estar vacío. \n|> Ingrese un nombre válido: ");
            nombre = sc.nextLine();
        }

        System.out.print("|> Ingrese el apellido del profesor: ");
        String apellido = sc.nextLine();

        while (apellido.isEmpty()) {
            System.out.print("El apellido no puede estar vacío. \n|> Ingrese un apellido válido: ");
            apellido = sc.nextLine();
        }

        System.out.print("|> Ingrese la especialidad del profesor: ");
        String especialidad = sc.nextLine();

        while (especialidad.isEmpty()) {
            System.out.print("La especialidad no puede estar vacía. \n|> Ingrese una especialidad válida: ");
            especialidad = sc.nextLine();
        }
        Profesor profesor = new Profesor(codigo, nombre, apellido, especialidad);
        profesores.add(profesor);
        System.out.println("\nProfesor registrado exitosamente.");
    } 

    //No aparece en el menú pero se puede usar para mostrar los profesores registrados
    public void mostrarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("\nNo hay profesores registrados.");
            return;
        }

        System.out.println("\n================================");
        System.out.println("     Profesores registrados     ");
        System.out.println("================================");

        for (Profesor p : profesores) {
            System.out.println(p.toString());
            System.out.println("-------------------------");
        }
    }
}
