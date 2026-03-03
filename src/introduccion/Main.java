package introduccion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static ListaEstudiante Lista;
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de gestión de estudiantes.");
        
        int opcion;

       do {
            MostrarMenu();

            opcion = IngresarEntero("");

            if (opcion == 1) {

                System.out.print("Ingrese el nombre del estudiante: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la calificación del estudiante: ");
                double calificacion = Double.parseDouble(scanner.nextLine());

                Lista.Estudiantes.add(nombre);
                Lista.Notas.add(calificacion);

                System.out.println("Estudiante agregado correctamente.");

            } else if (opcion == 2) {

                if (Lista.Estudiantes.isEmpty()) {
                    System.out.println("No hay estudiantes registrados.");
                } else {
                    System.out.println("\nLista de estudiantes:");
                    for (int i = 0; i < Lista.Estudiantes.size(); i++) {
                        System.out.println(Lista.Estudiantes.get(i) +
                                " - Calificación: " + Lista.Notas.get(i));
                    }
                }

            } else if (opcion == 3) {

                if (Lista.Estudiantes.isEmpty()) {
                    System.out.println("No hay calificaciones registradas.");
                } else {
                    double suma = 0;

                    for (double calificacion : Lista.Notas) {
                        suma += calificacion;
                    }

                    double promedio = suma / Lista.Notas.size();
                    System.out.println("El promedio de calificaciones es: " + promedio);
                }

            } else if (opcion == 4) {

                if (Lista.Notas.isEmpty()) {
                    System.out.println("No hay calificaciones registradas.");
                } else {

                    double maxCalificacion = Lista.Notas.get(0);
                    String estudianteMax = Lista.Estudiantes.get(0);

                    for (int i = 1; i < Lista.Notas.size(); i++) {
                        if (Lista.Notas.get(i) > maxCalificacion) {
                            maxCalificacion = Lista.Notas.get(i);
                            estudianteMax = Lista.Estudiantes.get(i);
                        }
                    }

                    System.out.println("El estudiante con la calificación más alta es: "
                            + estudianteMax + " con " + maxCalificacion);
                }

            } else if (opcion == 5) {

                System.out.println("Saliendo del sistema...");

            } else {

                System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while(opcion != 5);

        scanner.close();
    }

    
    static double IngresarCalificación(String mensaje) {
		System.out.print(mensaje);
		double num;
		while(true) {
			try {
				num = scanner.nextDouble();
				if (num > 100 || num < 0) {
					System.out.print("Calificación fuera de rango, intente nuevamente: ");
					scanner.next();
					continue;
				}
				break;
			} catch(InputMismatchException e) {
				System.out.print("Error en el formato, intente nuevamente: ");
				scanner.next();
			}
		}
		return num;
	}
    
    static int IngresarEntero(String mensaje) {
		System.out.print(mensaje);
		int num;
		while(true) {
			try {
				num = scanner.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.print("Error en el formato, intente nuevamente: ");
				scanner.next();
			}
		}
		return num;
	}    

    static void MostrarMenu() {
    	System.out.println("\n1. Agregar estudiante");
        System.out.println("2. Mostrar lista de estudiantes");
        System.out.println("3. Calcular promedio de calificaciones");
        System.out.println("4. Mostrar estudiante con la calificación más alta");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
