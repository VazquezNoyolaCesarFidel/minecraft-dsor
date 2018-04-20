public class Tachuela extends Pieza{
  public Clavo(Material m, String nombre){
    super(m,nombre);
  }
  public String toString(){
    return "Tachuela " + nombre + "fabricado de: " + descripcion;
  }
}
