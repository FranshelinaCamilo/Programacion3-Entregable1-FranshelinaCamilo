import java.util.*;

public class SistemaEstudiantes {

    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public void registrarEstudiante(Scanner sc) {
        System.out.print("Ingrese la matrícula: ");
        String matricula = sc.nextLine();

        while (matricula.isEmpty()) {
            System.out.print("La matrícula no puede estar vacía. \nIngrese una matrícula válida: ");
            matricula = sc.nextLine();
            
        }

        while(matricula.isEmpty()){
            System.out.print("La matrícula debe tener al menos 5 caracteres. \nIngrese una matrícula válida: ");
            matricula = sc.nextLine();
        }

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        while(nombre.isEmpty()){
            System.out.print("El nombre no puede estar vacío. \nIngrese un nombre: ");
            nombre = sc.nextLine();
        }

        System.out.print("Ingrese el apellido: ");
        String apellido = sc.nextLine();

        while(apellido.isEmpty()){
            System.out.print("El apellido no puede estar vacío. \nIngrese un apellido: ");
            apellido = sc.nextLine();
        }

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        while(edad < 1){
            System.out.print("La edad debe ser un número positivo. \nIngrese una edad válida: ");
            edad = sc.nextInt();
            sc.nextLine();
        }

        System.out.print("Ingrese la carrera: ");
        String carrera = sc.nextLine();

        while(carrera.isEmpty()){
            System.out.print("La carrera no puede estar vacía. \nIngrese una carrera: ");
            carrera = sc.nextLine();
        }

        System.out.print("Ingrese la fecha de inscripción: ");
        String fechaInscripcion = sc.nextLine();

        while(fechaInscripcion.isEmpty()){
            System.out.print("La fecha de inscripción no puede estar vacía. \nIngrese una fecha de inscripción: ");
            fechaInscripcion = sc.nextLine();
        }

        Estudiante estudiante = new Estudiante(matricula, nombre, apellido, edad, carrera, fechaInscripcion);
        estudiantes.add(estudiante);
    }
}
