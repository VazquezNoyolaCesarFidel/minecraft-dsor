public class Pinza extends Herramienta{
  public Pinza(String nombre){
    super(nombre);
  }
  public String toString(){
    return  "Pinza " + nombre + " fabricado con: " + descripcion;
  }
}
