import java.util.ArrayList;
public class CajaDeHerramientas{
  private ArrayList<Herramienta> herramientas;
  private ArrayList<Pieza> piezas;
  public CajaDeHerramientas(){
    herramientas = new  ArrayList<>();
    piezas = new ArrayList<>();
  }
  public void addHerramienta(Herramienta h){
    herramientas.add(h);
  }
  public void addPieza(Pieza p){
    piezas.add(p);
  }
  public int totalPiezas(){
    return piezas.size();
  }
  public int totalHerramientas(){
    return herramientas.size();
  }
  public void contenido(){
    System.out.println("----Piezas----- N° Piezas : " + totalPiezas());
    for(Pieza p: piezas){
        System.out.println(p.toString());
    }
    System.out.println("----Herramientas----- N° Herramientas: " + totalHerramientas());
    for(Herramienta h: herramientas){
        System.out.println(h.toString());
    }
  }
}
