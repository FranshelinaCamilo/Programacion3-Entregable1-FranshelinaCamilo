import java.util.*;

public class SistemaEstudiantes {

    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void registrarEstudiante(Scanner sc) {
        System.out.print("\n|> Ingrese la matrícula: ");
        String matricula = sc.nextLine();

        while (matricula.isEmpty()) {
            System.out.print("La matrícula no puede estar vacía. \n|> Ingrese una matrícula válida: ");
            matricula = sc.nextLine();

        }

        while (matricula.isEmpty()) {
            System.out.print("La matrícula debe tener al menos 5 caracteres. \n|> Ingrese una matrícula válida: ");
            matricula = sc.nextLine();
        }

        System.out.print("|> Ingrese el nombre: ");
        String nombre = sc.nextLine();

        while (nombre.isEmpty()) {
            System.out.print("El nombre no puede estar vacío. \n|> Ingrese un nombre: ");
            nombre = sc.nextLine();
        }

        System.out.print("|> Ingrese el apellido: ");
        String apellido = sc.nextLine();

        while (apellido.isEmpty()) {
            System.out.print("El apellido no puede estar vacío. \n|> Ingrese un apellido: ");
            apellido = sc.nextLine();
        }

        System.out.print("|> Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        while (edad < 1) {
            System.out.print("La edad debe ser un número positivo. \n|> Ingrese una edad válida: ");
            edad = sc.nextInt();
            sc.nextLine();
        }

        System.out.print("|> Ingrese la carrera: ");
        String carrera = sc.nextLine();

        while (carrera.isEmpty()) {
            System.out.print("La carrera no puede estar vacía. \n|> Ingrese una carrera: ");
            carrera = sc.nextLine();
        }

        System.out.print("|> Ingrese la fecha de inscripción: ");
        String fechaInscripcion = sc.nextLine();

        while (fechaInscripcion.isEmpty()) {
            System.out.print("La fecha de inscripción no puede estar vacía. \n|> Ingrese una fecha de inscripción: ");
            fechaInscripcion = sc.nextLine();
        }

        Estudiante estudiante = new Estudiante(matricula, nombre, apellido, edad, carrera, fechaInscripcion);
        estudiantes.add(estudiante);
    }

    public void buscarEstudiante(Scanner sc) {
        System.out.print("\n|> Ingrese la matrícula del estudiante a buscar: ");
        String matricula = sc.nextLine();

        System.out.println("\n================================");
        System.out.println("Resultado de la búsqueda");
        for (Estudiante e : estudiantes) {
            if (e.getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println(e.toString());
                return;
            }
        }

        System.out.println("Estudiante no encontrado.");
    }

    public void asignarMateria(Scanner sc) {
        System.out.print("\n|> Ingrese la matrícula del estudiante: ");
        String matricula = sc.nextLine();

        Estudiante estudiante = null;

        for (Estudiante e : estudiantes) {
            if (e.getMatricula().equalsIgnoreCase(matricula)) {

                estudiante = e;
                break;
            }
        }

        if (estudiante == null) {
            System.out.println("Estudiante no encontrado.");
            return;
        }

        System.out.print("|> Ingrese el código de la materia: ");
        String codigo = sc.nextLine();

        Materia materia = null;

        for (Materia m : SistemaMateria.materias) {
            if (m.getCodigo().equalsIgnoreCase(codigo)) {

                materia = m;
                break;
            }
        }

        if (materia == null) {
            System.out.println("Materia no encontrada.");
            return;
        }

        estudiante.getMaterias().add(materia);
        System.out.println("Materia asignada.");
    }

    public void registrarCalificacion(Scanner sc, SistemaMateria sisMat) {
        System.out.print("\n|> Ingrese la matrícula del estudiante: ");
        String matricula = sc.nextLine();

        Estudiante estudiante = null;

        for (Estudiante e : estudiantes) {
            if (e.getMatricula().equalsIgnoreCase(matricula)) {
                estudiante = e;
                break;
            }
        }

        if (estudiante == null) {
            System.out.println("Estudiante no encontrado.");
            return;
        }

        System.out.print("|> Ingrese el código de la materia: ");
        String codigo = sc.nextLine();

        for (Materia m : estudiante.getMaterias()) {
            if (m.getCodigo().equalsIgnoreCase(codigo)) {

                System.out.print("|> Ingrese la calificación: ");
                double nota = sc.nextDouble();
                sc.nextLine();

                m.setCalificacion(nota);

                System.out.println("Calificación registrada.");
                return;
            }
        }

        System.out.println("La materia no fue asignada al estudiante.");
    }

    public void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("\nNo hay estudiantes registrados.");
            return;
        }

        System.out.println("\n================================");
        System.out.println("     Estudiantes registrados    ");
        System.out.println("================================");
        for (Estudiante e : estudiantes) {
            System.out.println(e.toString());
            System.out.println("-------------------------");
        }
    }

    public void mostrarReportePromedios() {
        if (estudiantes.isEmpty()) {
            System.out.println("\nNo hay estudiantes registrados.");
            return;
        }

        System.out.println("\n================================");
        System.out.println("     Reporte de Promedios       ");
        System.out.println("================================");
        for (Estudiante e : estudiantes) {
            System.out.println("\n================================");
            System.out.println("Estudiante: "
                    + e.getNombre() + " "
                    + e.getApellido());

            System.out.println("--------------------------------");
            System.out.printf("%-25s %s%n",
                    "Materia",
                    "Calificación");

            double sumaPonderada = 0;
            int totalCreditos = 0;

            for (Materia m : e.getMaterias()) {
                System.out.printf("%-25s %.2f%n",
                        m.getNombre(),
                        m.getCalificacion());

                sumaPonderada += m.getCalificacion() * m.getCreditos();

                totalCreditos += m.getCreditos();
            }

            double promedio = 0;

            if (totalCreditos > 0) {
                promedio = sumaPonderada / totalCreditos;
            }

            System.out.println("--------------------------------");
            System.out.printf("Promedio: %.2f%n", promedio);

            if (promedio >= 70) {
                System.out.println("Estado: Aprobado");
            } else {
                System.out.println("Estado: Reprobado");
            }
        }
    }
}
