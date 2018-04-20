public class Clavo extends Pieza{
  public Clavo(Material m, String nombre){
    super(m,nombre);
  }
  public String toString(){
    return "Clavo" + nombre + "fabricado de: " + descripcion;
  }
}
