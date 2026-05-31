import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static SistemaEstudiantes SisEst = new SistemaEstudiantes();
    static SistemaProfesor SisProf = new SistemaProfesor();
    static SistemaMateria SisMat = new SistemaMateria();
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        int opcion;

        do{
            System.out.println("\n====================================");
            System.out.println("    SISTEMA DE GESTIÓN ACADÉMICA    ");
            System.out.println("====================================");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar profesor");
            System.out.println("3. Registrar materia");
            System.out.println("4. Asignar materia a estudiante");
            System.out.println("5. Registrar calificación");
            System.out.println("6. Buscar estudiante");
            System.out.println("7. Mostrar estudiantes");
            System.out.println("8. Mostrar materias");
            System.out.println("9. Mostrar reporte de promedios");
            System.out.println("10. Salir");

            System.out.print("\nIngrese su opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            while(opcion < 1 || opcion > 10){
                System.out.print("\nOpción inválida. \nIngrese una opción válida: ");
                opcion = sc.nextInt();
                sc.nextLine();
            }

            switch (opcion) {
                case 1:
                    SisEst.registrarEstudiante(sc);
                    break;
                case 2:
                    SisProf.registrarProfesor(sc);
                    break;
                case 3:
                    SisMat.registrarMateria(sc);
                    break;
                case 4:
                    SisEst.asignarMateria(sc, SisMat);
                    break;
                case 5:
                    SisEst.registrarCalificacion(sc, SisMat);
                    break;
                case 6:
                    SisEst.buscarEstudiante(sc);
                    break;
                case 7:
                    SisEst.mostrarEstudiantes();
                    break;
                case 8:
                    SisMat.mostrarMaterias();
                    break;
                case 9:
                    SisEst.mostrarReportePromedios();
                    break;
                case 10:
                    System.out.println("\nSaliendo del sistema...");
                    break;
            }
        }while (opcion != 10);

    }
}