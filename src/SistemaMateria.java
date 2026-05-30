import java.util.*;

public class SistemaMateria {

    static ArrayList<Materia> materias = new ArrayList<>();

    public void registrarMateria(Scanner sc) {
        System.out.print("\n|> Ingrese el código de la materia: ");
        String codigo = sc.nextLine();

        for (Materia m : materias) {
            if (m.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Ya existe una materia con ese código.");
                return;
            }
        }

        while (codigo.isEmpty()) {
            System.out.print("Código inválido. \n|> Ingrese un código válido: ");
            codigo = sc.nextLine();
        }

        System.out.print("|> Ingrese el nombre de la materia: ");
        String nombre = sc.nextLine();

        while (nombre.isEmpty()) {
            System.out.print("Nombre inválido. \n|> Ingrese un nombre válido: ");
            nombre = sc.nextLine();
        }

        System.out.print("|> Ingrese los créditos de la materia: ");
        int creditos = sc.nextInt();
        sc.nextLine(); 

        while (creditos < 1) {
            System.out.print("Créditos inválidos. \n|> Ingrese una cantidad de créditos válida: ");
            creditos = sc.nextInt();
            sc.nextLine();
        }

        Materia materia = new Materia(codigo, nombre, creditos);
        materias.add(materia);
        System.out.println("\nMateria registrada exitosamente.");
    }

    public Materia buscarMateria(Scanner sc) {
        System.out.print("\n|> Ingrese el código de la materia a buscar: ");
        String codigoMateria = sc.nextLine();

        System.out.println("Resultado de la búsqueda: " + codigoMateria);
        System.out.println("\n================================");

        for (Materia m : materias) {
            if (m.getCodigo().equalsIgnoreCase(codigoMateria)) {
                return m;
            }
        }
        System.out.println("\nMateria no encontrada.");
        return null;
    }

    public void mostrarMaterias() {

        System.out.println("\n================================");
        System.out.println("     Materias registradas       ");
        System.out.println("================================");

        if (materias.isEmpty()) {
            System.out.println("\nNo hay materias registradas.");
            return;
        }

        for (Materia m : materias) {
            System.out.println(m);
            System.out.println("-------------------------");
        }
    }
}
