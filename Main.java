package alumnos;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nombre = "";
    String asignatura = "";
    String profesor = "";
    double nota1;
    double nota2;
    double nota3;
    
    System.out.println("¡Bienvenido alumno!");
    System.out.println("En este programa podrás obtener tus datos académicos.\n");
    System.out.print("Introduce tu nombre: ");
    nombre = sc.nextLine();
    
    System.out.println();
    System.out.println("Asignaturas: ");    
    System.out.println("------------");
    System.out.println("(1) Programación");
    System.out.println("(2) Sistemas Informáticos");
    System.out.println("(3) Entornos de Desarrollo");
    System.out.println("(4) Lenguajes de Marcas");
    System.out.println("(5) Bases de Datos");
    System.out.println();
    
    System.out.print("Selecciona una opción: ");
    int opcion1 = sc.nextInt();
    System.out.println("----------------------");
    
    switch (opcion1) {
      case 1:
        asignatura = "Programación";
        profesor = "Luis José Sánchez";
        break;
        
      case 2:
        asignatura = "Sistemas Informáticos";
        profesor = "Antonio José Sánchez Bujaldón";
        break;
        
      case 3:
        asignatura = "Entornos de Desarrollo";
        profesor = "Pilar Gonzalez Augusto";
        break;
        
      case 4:
        asignatura = "Lenguajes de Marcas";
        profesor = "Pilar Gonzalez Augusto";
        break;
        
      case 5:
        asignatura = "Bases de Datos";
        profesor = "Eva María Perales Belizón";
        break;
        
      default:
        System.out.println("¡Error!");
        System.out.println("Has seleccionado una opción que no está disponible.");
    }
    
    System.out.println();
    System.out.print("Introduce la nota del primer trimestre: ");
    nota1 = sc.nextDouble();
    System.out.println();
    
    System.out.print("Introduce ahora la nota del segundo trimestre: ");
    nota2 = sc.nextDouble();
    System.out.println();
    
    System.out.print("Por último, introduce la nota del tercer trimestre: ");
    nota3 = sc.nextDouble();
    System.out.println();
    
    Asignatura as = new Asignatura(asignatura, profesor, nota1, nota2, nota3);
    
    Alumno al = new Alumno(nombre, as.getNotaMedia());
    
    al.generarExpediente();
    
    System.out.println("¿Qué deseas hacer?");    
    System.out.println("------------------");
    System.out.println("(1) Realizar un trabajo de subir nota.");
    System.out.println("(2) Ver información de la asignatura.");
    System.out.println("(3) Ver información sobre mí.");
    System.out.println();
    
    System.out.print("Selecciona una opción: ");
    int opcion2 = sc.nextInt();
    System.out.println("------------------------");
    
    switch(opcion2) {
      case 1:
        if (al.getNotaMedia() == 10) {
          System.out.println();
          System.out.println("No puede subir nota si su nota media es un 10.");
        } else {
          al.subirNota();
          System.out.println("Su nueva nota media es un " + as.getNotaMedia());
        }
        break;
        
      case 2:
        System.out.println("Asignatura: " + as.getNombreA());
        System.out.println("Profesor: " + as.getProfesor());
        System.out.println("Nota Media: " + as.getNotaMedia());
        break;
    }
  }
}