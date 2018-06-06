package alumnos;

public class Alumno {
  // Atributos
  private String nombre = "";
  private double notaMedia = 0;
  private String expediente = "";
  

  // Constructor
  public Alumno(String n, double nm) {
    this.nombre = n;
    this.notaMedia = nm;
  }

  // Getter
  public String getNombre() {
    return this.nombre;
  }

  public double getNotaMedia() {
    return this.notaMedia;
  }
  
  public String getExpediente() {
    return this.expediente;
  }

  // Setter
  public void setNombre(String n) {
    this.nombre = n;
  }

  public void setNotaMedia(double nm) {
    this.notaMedia = nm;
  }
  
  public void setExpediente(String ex) {
    this.expediente = ex;
  }

  // To String
  @Override
  public String toString() {
    return "Hola, mi nombre es " + this.nombre + ", mi nota media final es un " + this.notaMedia + " y mi número de expediente es " + this.expediente;
  }
  
  // Método subirNota()
  public Alumno subirNota() {
    if (this.notaMedia < 9) {
      this.notaMedia += 1;
    } else {
      System.out.println("No puede subir un punto si su nota es mayor que 9.");
    }
    return this;
  }
  
  // Método generarExpediente()
  public void generarExpediente() {
    char[] elementos = {'0','1','2','3','4','5','6','7','8','9'};      
    char[] conjunto = new char[10];
    int el;
    
    for (int i = 0; i < 10; i++) {
      el = (int)(Math.random()*10);
      conjunto[i] = elementos[el];
    }
    
    String nExpediente = new String(conjunto);          
    this.expediente = nExpediente;
  }  
}