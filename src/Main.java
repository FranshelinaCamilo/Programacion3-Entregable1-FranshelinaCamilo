import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        int opcion;

        do{
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();

            while(opcion < 1 || opcion > 10){
                System.out.print("Opción inválida. \nIngrese una opción válida: ");
                opcion = sc.nextInt();
            }

            System.out.println("====================================");
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

            switch (opcion) {
                case 1:
                    System.out.println("Registrar estudiante");
                    break;
                case 2:
                    System.out.println("Registrar profesor");
                    break;
                case 3:
                    System.out.println("Registrar materia");
                    break;
                case 4:
                    System.out.println("Asignar materia a estudiante");
                    break;
                case 5:
                    System.out.println("Registrar calificación");
                    break;
                case 6:
                    System.out.println("Buscar estudiante");
                    break;
                case 7:
                    System.out.println("Mostrar estudiantes");
                    break;
                case 8:
                    System.out.println("Mostrar materias");
                    break;
                case 9:
                    System.out.println("Mostrar reporte de promedios");
                    break;
                case 10:
                    System.out.println("Saliendo del sistema...");
                    break;
            }
        }while (opcion != 10);

    }
}