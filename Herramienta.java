public abstract class Herramienta{
  protected String nombre; //Punta plana, Punta de Cruz
  protected double vida;
  protected String descripcion;
  public Herramienta(String nombre){
    this.nombre = nombre;
    descripcion = "";
  }
  public  void addMaterial(Material material){
      vida += material.getDureza();
      descripcion += " " + material.getNombre();
  }
  public String getNombre(){
      return nombre;
  }
  public double getVida(){
    return vida;
  }
}
