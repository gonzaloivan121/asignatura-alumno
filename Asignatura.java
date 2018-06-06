package alumnos;

public class Asignatura {
  // Atributos
  private final String nombreA;
  private final double nota1;
  private final double nota2;
  private final double nota3;
  
  private String profesor;
  private double notaMedia;

  // Constructor
  public Asignatura(String n, String p, double n1, double n2, double n3) {
    this.nombreA = n;
    this.profesor = p;
    this.nota1 = n1;
    this.nota2 = n2;
    this.nota3 = n3;
  }
  
  // Getter
  public String getNombreA() {
    return this.nombreA;
  }

  public String getProfesor() {
    return this.profesor;
  }

  public double getNotaMedia() {
    return this.notaMedia;
  }
  
  // Setter
  public void setNotaMedia(double nm) {
    this.notaMedia = nm;
  }
  
  public void setProfesor(String p) {
    this.profesor = p;
  }
  
  // To String
  @Override
  public String toString() {
    return "El nombre de la asignatura es " + this.nombreA + ", el profesor que la da es " + this.profesor + " y la nota media del alumno es " + this.notaMedia;
  }
  
  // Métodos
  public double calcularNotaMedia() {
    double media = (this.nota1 + this.nota2 + this.nota3) / 3;
    return media;
  }
}
