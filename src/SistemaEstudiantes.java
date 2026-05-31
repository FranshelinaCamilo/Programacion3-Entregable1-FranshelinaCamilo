import java.util.*;

public class SistemaEstudiantes {

    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void registrarEstudiante(Scanner sc) {
        System.out.print("\n|> Ingrese la matrícula: ");
        String matricula = sc.nextLine();

        for (Estudiante e : estudiantes) {
            if (e.getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println("Ya existe un estudiante con esa matrícula.");
                return;
            }
        }

        while (matricula.isEmpty()) {
            System.out.print("La matrícula no puede estar vacía. \n|> Ingrese una matrícula válida: ");
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
        System.out.println("\nEstudiante registrado.");
    }

    public void buscarEstudiante(Scanner sc) {
        System.out.print("\n|> Ingrese la matrícula o nombredel estudiante a buscar: ");
        String criterio = sc.nextLine();

        System.out.println("\nRESULTADO DE LA BÚSQUEDA: " + criterio);
        System.out.println("================================");

        for (Estudiante e : estudiantes) {
            if (e.getMatricula().equalsIgnoreCase(criterio) || e.getNombre().equalsIgnoreCase(criterio)) {
                System.out.println(e.toString());
                return;
            }
        }
        System.out.println("\nEstudiante no encontrado.");
    }

    public void asignarMateria(Scanner sc, SistemaMateria sisMat) {
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

        Materia materiaOriginal = null;

        for (Materia m : sisMat.getMaterias()) {
            if (m.getCodigo().equalsIgnoreCase(codigo)) {
                materiaOriginal = m;
                break;
            }
        }

        if (materiaOriginal == null) {
            System.out.println("Materia no encontrada.");
            return;
        }

        for (Materia m : estudiante.getMaterias()) {
            if (m.getCodigo().equalsIgnoreCase(materiaOriginal.getCodigo())) {
                System.out.println("La materia ya está asignada a este estudiante.");
                return;
            }
        }

        estudiante.getMaterias().add(new Materia(materiaOriginal));
        System.out.println("\nMateria asignada.");
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
            System.out.println("\nEstudiante no encontrado.");
            return;
        }

        System.out.print("|> Ingrese el código de la materia: ");
        String codigo = sc.nextLine();

        for (Materia m : estudiante.getMaterias()) {
            if (m.getCodigo().equalsIgnoreCase(codigo)) {
                if (m.getCalificacion() > 0) {
                    System.out.println(
                            "\nLa materia ya tiene una calificación registrada: " + m.getCalificacion());

                    System.out.print("¿Desea reemplazarla? (S/N): ");
                    String respuesta = sc.nextLine();

                    if (!respuesta.equalsIgnoreCase("S")) {
                        System.out.println("\nCancelada.");
                        return;
                    }
                }

                System.out.print("|> Ingrese la calificación: ");
                double nota = sc.nextDouble();
                sc.nextLine();

                while (nota < 0 || nota > 100) {
                    System.out.print("Calificación inválida (0-100). \n|> Ingrese de nuevo: ");
                    nota = sc.nextDouble();
                    sc.nextLine();
                }

                m.setCalificacion(nota);

                System.out.println("\nCalificación registrada.");
                return;
            }
        }
        System.out.println("\nLa materia no fue asignada al estudiante.");
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
            System.out.println("Estudiante: " + e.getNombre() + " " + e.getApellido());

            System.out.println("--------------------------------");
            System.out.printf("%-25s %s\n", "Materia", "Calificación");

            double sumaPonderada = 0;
            int totalCreditos = 0;

            for (Materia m : e.getMaterias()) {
                System.out.printf("%-25s %.2f\n",
                        m.getNombre(),
                        m.getCalificacion());

                sumaPonderada += m.getCalificacion() * m.getCreditos();
                totalCreditos += m.getCreditos();
            }

            System.out.println("--------------------------------");

            if (e.getMaterias().isEmpty()) {
                System.out.println("\nNo se puede calcular el promedio.");
                System.out.println("El estudiante no tiene materias asignadas.");
            } else if (e.getMaterias().size() == 1) {
                double nota = e.getMaterias().get(0).getCalificacion();

                System.out.printf("Calificación: %.2f\n", nota);

                if (nota >= 70)
                    System.out.println("Estado: Aprobado");
                else
                    System.out.println("Estado: Reprobado");
            } else {
                double promedio = sumaPonderada / totalCreditos;

                System.out.printf("Promedio: %.2f\n", promedio);

                if (promedio >= 70)
                    System.out.println("Estado: Aprobado");
                else
                    System.out.println("Estado: Reprobado");
            }
        }
    }
}