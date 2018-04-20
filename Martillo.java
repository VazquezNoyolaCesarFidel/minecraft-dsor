public class Martillo extends Herramienta{
  public Martillo(String nombre){
    super(nombre);
  }
  public String toString(){
    return  "Martillo " + nombre + " fabricado con: " + descripcion + " " + vida;
  }
}
