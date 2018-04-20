public class Desarmador extends Herramienta{
  public Desarmador(String nombre){
    super(nombre);
  }
  public String toString(){
    return  "Desarmador " + nombre + " fabricado con: " + descripcion + " " + vida;
  }
}
