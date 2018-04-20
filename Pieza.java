public abstract class Pieza{
  protected String nombre;
  protected double vida;
  protected String descripcion;
  protected Material material;
  public Pieza(Material material,String nombre){
    this.material = material;
    this.nombre = nombre;
    vida = material.getDureza();
    descripcion = material.getNombre() + " " +vida;
  }
  public double getVida(){
    return vida;
  }
  public String getNombre(){
    return nombre;
  }

}
