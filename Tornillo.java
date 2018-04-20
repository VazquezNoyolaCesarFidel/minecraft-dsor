public class Tornillo extends Pieza{
  public Tornillo(Material m, String nombre){
    super(m,nombre);
  }
  public String toString(){
    return "Tornillo" + nombre + "fabricado de: " + descripcion;
  }
}
